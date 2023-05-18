/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays; 

/**
 *
 * @author ricar
 */
public class PrePost {
    private Stack<ExprToken> op;
    private Stack<ExprToken> opn;
    private HashMap<String, Tokens> tablaIdentificadores;
    private int count;
    public ArrayList<ArrayList<ExprToken>> tercetos;
    private static HashMap<Tokens, Integer> precedence;
    
    PrePost(HashMap<String, Tokens> tablaIdentificadores) {
        this.tablaIdentificadores = tablaIdentificadores; 
        count = 0;
        this.tercetos = new ArrayList<>();
        op = new Stack<>();
        opn = new Stack<>();
        precedence = new HashMap<>();
        precedence.put(Tokens.Parentesis_c, 4);
        precedence.put(Tokens.Potencia, 3);
        precedence.put(Tokens.Multiplicacion, 2);
        precedence.put(Tokens.Division, 2);
        precedence.put(Tokens.Suma, 1);
        precedence.put(Tokens.Resta, 1);
        precedence.put(Tokens.Parentesis_a, 0);
    }
    
    private Tokens getType(ExprToken x) {
        if(x.token == Tokens.Character || x.token == Tokens.Double || 
                x.token == Tokens.Integer || x.token == Tokens.Logical) {
            return x.token;
        }
        if(x.token == Tokens.Identificador) return tablaIdentificadores.get(x.value);
        if(x.token == Tokens.Numero) return Tokens.Integer;
        if(x.token == Tokens.NumeroReal) return Tokens.Double;
        if(x.token == Tokens.Cadena) return Tokens.Character; 
        return Tokens.Integer;
    }
    
    private Boolean invalidTypes(ExprToken a, ExprToken b) {
        Tokens typeofa = getType(a), typeofb = getType(b);
        if(typeofa == Tokens.Integer) typeofa = Tokens.Double;
        if(typeofb == Tokens.Integer) typeofb = Tokens.Double;
        //System.out.println(typeofa);
        //System.out.println(typeofb);
        return typeofa != typeofb; 
    }

    private void operate() throws Exception{
        ExprToken b = opn.pop();
        ExprToken a = opn.pop();
        // Regla 4
        if(a.token == Tokens.Identificador && !tablaIdentificadores.containsKey(a.value)) {
            throw new Exception(
                    String.format("Error en la linea %s. Operación no permitida: la variable <%s> no ha sido declarada en este contexto", 
                            a.line, a.value)
            );
        }
        if(b.token == Tokens.Identificador && !tablaIdentificadores.containsKey(b.value)) {
            throw new Exception(
                    String.format("Error en la linea %s. Operación no permitida: la variable <%s> no ha sido declarada en este contexto", 
                            b.line, b.value)
            );
        }
        // Regla 1
        if(invalidTypes(a, b)) {
            throw new Exception(
                    String.format("Error en la linea %s. Operación artimética no permitida: los tipos de dato no corresponden", 
                            a.line)
            );
        }
        ExprToken newt = new ExprToken(Tokens.Identificador, "t" + Integer.toString(++count), a.line);
        
        this.tablaIdentificadores.put(newt.value, getType(a)); // hereda el tipo de a 
        ArrayList<ExprToken> terceto = new ArrayList<>();
        terceto.add(newt);
        terceto.add(new ExprToken(Tokens.Igual, "<-", a.line)); 
        terceto.add(a);
        terceto.add(op.pop());
        terceto.add(b); 
        
        // Regla 5
        Boolean iszero = false; 
        try {
            if(Double.parseDouble(terceto.get(4).value) == 0) iszero = true;
        }
        catch(Exception ex) {}
        
        if(terceto.get(3).token == Tokens.Division && iszero) {
            throw new Exception(
                    String.format("Error en la linea %s. Operación artimética no permitida: la división entre 0 no está determinada", 
                            a.line)
            );
        }
        
        tercetos.add(terceto);
        opn.push(newt);
    }
    
    private Boolean isOperator(ExprToken token) {
        return precedence.containsKey(token.token);
    }
    
    private ArrayList<ExprToken> preprocess(ArrayList<ExprToken> tokens) {
        ArrayList<ExprToken> res = new ArrayList<>();
        for(ExprToken t: tokens) {
            if(t.token == Tokens.Character || t.token == Tokens.Logical || 
                    t.token == Tokens.Integer || t.token == Tokens.Double) {
                continue;
            }
            if(t.token == Tokens.Op_atribucion) {
                res.add(new ExprToken(Tokens.Igual, "<-", t.line)); 
                res.add(res.get(res.size() - 2)); 
                switch(t.value) {
                    case "+=":
                        res.add(new ExprToken(Tokens.Suma, "+", t.line));
                        break;
                    case "-=":
                        res.add(new ExprToken(Tokens.Resta, "-", t.line));
                        break;
                    case "*=":
                        res.add(new ExprToken(Tokens.Multiplicacion, "*", t.line));
                        break;
                    case "/=":
                        res.add(new ExprToken(Tokens.Division, "/", t.line));
                        break;
                    default:
                        res.add(new ExprToken(Tokens.Suma, "+", t.line));
                }
            }
            else {
                res.add(t);
            }
        }
        ArrayList<ExprToken> terceto = new ArrayList<>();
        terceto.add(res.get(0));
        terceto.add(new ExprToken(Tokens.Igual, "<-", 0));
        tercetos.add(terceto);
        res.remove(0); // variable name
        if(!res.isEmpty())res.remove(0); // simbolo igual
        return res;
    }
    
    public void evaluate(ArrayList<ExprToken> tokens) throws Exception {
        op.clear();
        opn.clear();
        tercetos.clear();
        tokens = preprocess(tokens);
        for (ExprToken token : tokens) {
            if (token.token == Tokens.Parentesis_c) {
                while (op.peek().token != Tokens.Parentesis_a) {
                    operate();
                }
                op.pop();
            } else if (isOperator(token)) {
                if (op.empty() || token.token == Tokens.Parentesis_a || precedence.get(token.token) > precedence.get(op.peek().token)) {
                    op.push(token);
                } else {
                    operate();
                    op.push(token);
                }
            } else {
                opn.push(token);
            }
        }
        while (opn.size() > 1) {
            operate();
        }
        ExprToken last = new ExprToken(tablaIdentificadores.get(tercetos.get(0).get(0).value), "t" + Integer.toString(count), 0);
        if(!opn.isEmpty()) {
            last = opn.pop(); 
        }
        //System.out.println(last);
        //System.out.println(tercetos.get(0).get(0));
        // regla 2
        if(invalidTypes(tercetos.get(0).get(0), last)) {
            throw new Exception(
                    String.format("Error en la linea %s. Asignación no permitida:" + 
                            "el tipo de dato a asignar no corresponde con el de la variable", 
                            tercetos.get(0).get(0).line)
            );
        }
        tercetos.get(0).add(last);
        tercetos.add(new ArrayList<ExprToken>(tercetos.get(0)));
        tercetos.remove(0);
    }
}

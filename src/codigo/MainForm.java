/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import java.awt.Color;
import java.io.*; 
import java.util.logging.*; 
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }
    private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtArchivo.getText(); //en expr carga la info del text area
        Lexer lexer = new Lexer(new StringReader(expr)); //genera objeto lexer (lexeman)
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex(); //categoriza el lexema
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) { // Muestra la información léxica
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Character:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Cadena>\t\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  <Reservada for>\t" + lexer.lexeme + "\n";
                    break;
                case Repeat:
                    resultado += "  <Reservada repeat>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case NumeroReal:
                    resultado += "  <Numero Real>\t\t" + lexer.lexeme + "\n";
                    break;
                case Dos_puntos:
                    resultado += "  <Dos Puntos>\t\t" + lexer.lexeme + "\n";
                    break;
                case True:
                    resultado += "  <Valor booleano>\t\t" + lexer.lexeme + "\n";
                    break;
                case False:
                    resultado += "  <Valor booleano>\t\t" + lexer.lexeme + "\n";
                    break;
                case Function:
                    resultado += "  <Reservada function>\t\t" + lexer.lexeme + "\n";
                    break;
                case Break:
                    resultado += "  <Reservada break>\t\t" + lexer.lexeme + "\n";
                    break;
                case Next:
                    resultado += "  <Reservada next>\t\t" + lexer.lexeme + "\n";
                    break;
                case In:
                    resultado += "  <Reservada in>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArchivo = new javax.swing.JButton();
        btnAnalizarLex = new javax.swing.JButton();
        btnLimpiarLex = new javax.swing.JButton();
        jscrollpanel1 = new javax.swing.JScrollPane();
        txtArchivo = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnAnalizarSin = new javax.swing.JButton();
        btnLimpiarSin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtExpresiones = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtIdentificadores = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAnalizarSem = new javax.swing.JTextArea();
        btnAnalizarSem = new javax.swing.JButton();
        btnLimpiarSem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtTercetos = new javax.swing.JTextArea();
        btnTercetos = new javax.swing.JButton();
        btnLimpiarTercetos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Léxico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnArchivo.setText("Abrir archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnAnalizarLex.setText("Analizar");
        btnAnalizarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexActionPerformed(evt);
            }
        });

        btnLimpiarLex.setText("Limpiar");
        btnLimpiarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLexActionPerformed(evt);
            }
        });

        txtArchivo.setColumns(20);
        txtArchivo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtArchivo.setRows(5);
        jscrollpanel1.setViewportView(txtArchivo);

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane1.setViewportView(txtAnalizarLex);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jscrollpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnalizarLex)
                        .addGap(260, 260, 260)
                        .addComponent(btnLimpiarLex))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArchivo)
                    .addComponent(btnAnalizarLex)
                    .addComponent(btnLimpiarLex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrollpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Sintáctico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnAnalizarSin.setText("Analizar");
        btnAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSinActionPerformed(evt);
            }
        });

        btnLimpiarSin.setText("Limpiar");
        btnLimpiarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSinActionPerformed(evt);
            }
        });

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarSin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnalizarSin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarSin)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizarSin)
                    .addComponent(btnLimpiarSin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Semántico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla de expresiones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtExpresiones.setColumns(20);
        txtExpresiones.setRows(5);
        jScrollPane3.setViewportView(txtExpresiones);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla de identificadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtIdentificadores.setColumns(20);
        txtIdentificadores.setRows(5);
        jScrollPane4.setViewportView(txtIdentificadores);

        txtAnalizarSem.setColumns(20);
        txtAnalizarSem.setRows(5);
        jScrollPane5.setViewportView(txtAnalizarSem);

        btnAnalizarSem.setText("Analizar");
        btnAnalizarSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSemActionPerformed(evt);
            }
        });

        btnLimpiarSem.setText("Limpiar");
        btnLimpiarSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAnalizarSem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarSem))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizarSem)
                    .addComponent(btnLimpiarSem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ejecución de código", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtTercetos.setColumns(20);
        txtTercetos.setRows(5);
        jScrollPane6.setViewportView(txtTercetos);

        btnTercetos.setText("Ejecutar");
        btnTercetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTercetosActionPerformed(evt);
            }
        });

        btnLimpiarTercetos.setText("Limpiar");
        btnLimpiarTercetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTercetosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnTercetos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarTercetos)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTercetos)
                    .addComponent(btnLimpiarTercetos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        try {    
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            BufferedReader lector = new BufferedReader(new FileReader(chooser.getSelectedFile().getPath()));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = lector.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            String fileContents = sb.toString(); 
            txtArchivo.setText(fileContents);
        }
        catch (IOException ex) {
             Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnAnalizarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLexActionPerformed

    private void btnAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSinActionPerformed
        String ST = txtArchivo.getText(); //carga el texto al string 
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST))); //genera un objeto símbolo 

        try {
            s.parse(); //realiza el análisis
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61)); //color diferente al que usa Java
        } catch (Exception ex) {
            Symbol sym = s.getS(); //del SintaxCup
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAnalizarSinActionPerformed

    private void btnLimpiarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLexActionPerformed
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_btnLimpiarLexActionPerformed

    private void btnLimpiarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSinActionPerformed
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_btnLimpiarSinActionPerformed
    
    private HashMap<String, Tokens> tablaIdentificadores;
    private ArrayList<ArrayList<ExprToken>> tablaExpresiones; 
    
    private void generarIdentificadores() throws IOException, Exception {
        tablaIdentificadores = new HashMap<>(); 
        int cont = 1;
        String expr = (String) txtArchivo.getText(); //en expr carga la info del text area
        Lexer lexer = new Lexer(new StringReader(expr)); //genera objeto lexer (lexeman)
        while (true) {
            Tokens token = lexer.yylex(); //categoriza el lexema
            if (token == null) {
                return;
            }
            if (token == Tokens.Linea) {
                cont++;
            }
            else if (token == Tokens.Character || token == Tokens.Logical || 
                    token == Tokens.Integer || token == Tokens.Double) {
                lexer.yylex();
                if(tablaIdentificadores.containsKey(lexer.lexeme)) {
                    // Regla 3
                    throw new Exception(
                            String.format("Error en la linea %s. Declaración no permitida. La variable <%s> ya existe", 
                                    cont, lexer.lexeme)
                    );
                }
                tablaIdentificadores.put(lexer.lexeme, token); 
            }
        }
    }
    
    private void generarExpresiones() throws IOException, Exception {
        tablaExpresiones = new ArrayList<>();
        String expr = (String) txtArchivo.getText(); //en expr carga la info del text area
        Lexer lexer = new Lexer(new StringReader(expr)); //genera objeto lexer (lexeman)
        int state = 0;
        int cont = 0;
        ArrayList<ExprToken> expression = new ArrayList<>();
        //System.out.println("in");
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) return;
            if (token == Tokens.Linea) {
                state = 1;
                cont++;
            }
            else if (state == 1 && !(token == Tokens.Character || 
                    token == Tokens.Logical || token == Tokens.Integer || 
                    token == Tokens.Double || token == Tokens.Identificador)) state = 0;
            else if (state == 1) state = 2;
            
            if (state == 2){
                //System.out.println(token);
                if(token == Tokens.P_coma) {
                    //System.out.println(expression);
                    state = 0; 
                    tablaExpresiones.add(new ArrayList<>(expression));
                    expression.clear();
                }
                else expression.add(new ExprToken(token, lexer.lexeme, cont + 1));
            }
        }
    }
    
    private void btnAnalizarSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSemActionPerformed
        // Generar tabla de identificadores
        try {
            generarIdentificadores();
            String resultado = "";
            for(String name: tablaIdentificadores.keySet()) {
                resultado += name + "\t->\t" + tablaIdentificadores.get(name).toString() + "\n";
            }
            txtIdentificadores.setText(resultado);
        }
        catch(Exception ex){
            txtAnalizarSem.setText(ex.getMessage());
            txtAnalizarSem.setForeground(Color.red);
            return; 
        }
        // Generar tabla de expresiones
        try {
            generarExpresiones();
            String resultado = "";
            for(ArrayList<ExprToken> expr: tablaExpresiones) {
                String strExpr = "";
                for(ExprToken t: expr) {
                    strExpr += t.token + "(" + t.value + ") ";
                }
                resultado += strExpr + "\n";
            }
            txtExpresiones.setText(resultado);
        }
        catch(Exception ex){  
            txtAnalizarSem.setText(ex.getMessage());
            txtAnalizarSem.setForeground(Color.red);
            return; 
        }
    }//GEN-LAST:event_btnAnalizarSemActionPerformed

    private void btnLimpiarSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSemActionPerformed
        txtAnalizarSem.setText(null);
        txtIdentificadores.setText(null);
        txtExpresiones.setText(null);
    }//GEN-LAST:event_btnLimpiarSemActionPerformed

    private void btnTercetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTercetosActionPerformed
        PrePost executer = new PrePost(tablaIdentificadores);
        String result = "";
        for(ArrayList<ExprToken> expr: tablaExpresiones) {
            try {
                executer.evaluate(expr);
            }
            catch(Exception ex){  
                txtAnalizarSem.setText(ex.getMessage());
                txtAnalizarSem.setForeground(Color.red);
                return; 
            }
            for(ArrayList<ExprToken> terceto: executer.tercetos) {
                for(ExprToken t: terceto) {
                    result += t.value + " ";
                }
                result += "\n";
            }
            result += "-----------------------------------\n"; 
        }
        txtTercetos.setText(result);
    }//GEN-LAST:event_btnTercetosActionPerformed

    private void btnLimpiarTercetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTercetosActionPerformed
        txtTercetos.setText(null);
        txtAnalizarSem.setText(null);
    }//GEN-LAST:event_btnLimpiarTercetosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLex;
    private javax.swing.JButton btnAnalizarSem;
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnLimpiarLex;
    private javax.swing.JButton btnLimpiarSem;
    private javax.swing.JButton btnLimpiarSin;
    private javax.swing.JButton btnLimpiarTercetos;
    private javax.swing.JButton btnTercetos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jscrollpanel1;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSem;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtArchivo;
    private javax.swing.JTextArea txtExpresiones;
    private javax.swing.JTextArea txtIdentificadores;
    private javax.swing.JTextArea txtTercetos;
    // End of variables declaration//GEN-END:variables
}

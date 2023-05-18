/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

/**
 *
 * @author ricar
 */
public class ExprToken {
    public Tokens token;
    public String value;
    public int line;
    ExprToken(Tokens token, String value, int line) {
        this.token = token;
        this.value = value;
        this.line = line;
    }
    @Override
    public String toString() {
        return this.token + "|" + this.value; 
    }
}

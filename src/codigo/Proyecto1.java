/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo;

import java.io.File; 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ricar
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    private static final String PATH = "D:/ricar/Documents/UP/8/Compiladores/Compiladores-R/";
    
    public static void main(String[] args) throws Exception{
        String ruta1 = PATH + "src/codigo/Lexer.flex";
        String ruta2 = PATH + "src/codigo/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", PATH + "src/codigo/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym  = Paths.get(PATH + "src/codigo/sym.java");
        if(Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        
        Files.move(
                Paths.get(PATH + "sym.java"), 
                Paths.get(PATH + "src/codigo/sym.java")
        );
        
        Path rutaSin  = Paths.get(PATH + "src/codigo/Sintax.java");
        if(Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        
        Files.move(
                Paths.get(PATH + "Sintax.java"), 
                Paths.get(PATH + "src/codigo/Sintax.java")
        );
        
    }
    
}

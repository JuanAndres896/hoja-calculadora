/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 25 de Julio del 2016
 * Descripción: Esta clase utiliza la clase la calculadora y le da un stack tipo ArrayList o tipo Vector, donde puede funcionar con cualquiera
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    
    //Metodo para leer un archivo .TXT
     public static String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        b.close();
        return cadena;
    }
 
    public static void main(String[] args) throws IOException {
        
        Stack pila = new StackVector<String>();
        Calculadora calc = new Calculadora(pila);
        String cadena = muestraContenido("C:/Users/Christian Morales/Desktop/archivo.txt");
        int resultado = calc.evaluar( cadena );
        System.out.println("El resultado es: "+resultado);
    }
    
}

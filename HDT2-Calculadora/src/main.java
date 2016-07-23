/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Christian Morales
 */
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
        
        Stack pila = new StackArrayList<String>();
        Calculadora calc = new Calculadora(pila);
        calc.evaluar(muestraContenido("C:/Users/Christian Morales/Desktop/archivo.txt") );
        String cadena = muestraContenido("C:/Users/Christian Morales/Desktop/archivo.txt");
        int resultado = calc.evaluar( cadena );
        System.out.println("El resultado es: "+resultado);
    }
    
}

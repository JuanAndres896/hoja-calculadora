/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 13 de Julio del 2016
 * Descripción: Esta clase sera la encargada de utilizar el stack, ya sea en modo ArrayList o en modo Vector. En cualquiera de sus implementacion debe
 * funcionar adecuadamente, pues esta clase trabaja de manera estandarizada. 
 */
public class Calculadora {
    
    /**
     * Atributo para asignar una implementacion de stack ya sea tipo ArrayList o Vector
     */
    Stack pila;
    
    /**
     * Este es el constructor, en donde se le asigna un tipo de Stack
     * @param pila Objeto tipo Stack, o sea cualquiera de sus implementaciones
     */
    public Calculadora(Stack pila){
        this.pila = pila;
    }
    
    /**
     * Este metodo se encarga de leer las instrucciones y devolver el valor resultante.
     * @param readItem un String en donde recibe toda la cadena de caracteres que esta en archivo.txt para su identificacion como operandos u operaciones
     * @return el resultado de las operaciones dadas en el archivo.txt
     */
    public int evaluar(String readItem){
        String caracter, variableS; //la variable caracter se utiliza para almacenar temporalmente cada caracter de la cadena, variableS se utilizará temporalmente para guardar el resultado de una operacion como un string para ser subido al stack
        int cantidadE = 0; // (recibe el tamaño del stack) Esta variable sera el contador para saber cuantas veces debe hacerce "pop" del stack para obtener los operandos y operarlos
        int variable = 0; // variable estará encargada de tener el resultado total, conforme se vayan realizando las operaciones
        int temp = 0; // temp es una variable temporal que almacenara cada a un operando cada vez que se haga "pop" del stack, luego se operara y se repetira el proceso
        //Este ciclo va a recorrer la cadena para identificar cada caracter y realizar una accion dependiendo de que sea
        for(int i = 0; i < readItem.length(); i++){
            caracter = Character.toString(readItem.charAt(i)); //aqui se obtiene temporalmente cada caracter y se convierte a un String para su manejo
            //Este primer if identifica a los posibles operandos (numeros de 0-9) y los sube al stack
            if(caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8") || caracter.equals("9")){
                pila.push(caracter); //se llama al metodo "push" del stack que se esta utilizando y se sube el operando a la pila
            // este if hace la operacion de suma
            }else if(caracter.equals("+")){
                cantidadE = pila.size();
                //este ciclo interno, va haciando "pop" cantidadE veces para sumar cada operando en el stack con variable (que maneja el resultado)
                for(int j = 0; j <cantidadE; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp + variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }else if(caracter.equals("-")){
                cantidadE = pila.size();
                for(int j = 0; j <cantidadE; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp - variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }else if(caracter.equals("*")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp * variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }else if(caracter.equals("/")){
                cantidadE = pila.size();
                variable = Integer.parseInt((String) pila.pop());
                for(int j = 0; j <cantidadE-1; j++){
                    temp = Integer.parseInt((String) pila.pop()) / variable;
                }
                variableS = Integer.toString(temp);
                pila.push(variableS);
            }
        }
        return Integer.parseInt((String) pila.pop());
    }
    
}

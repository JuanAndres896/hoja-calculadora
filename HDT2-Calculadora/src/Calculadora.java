/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Morales
 */
public class Calculadora {
    
    Stack pila;
    
    public Calculadora(Stack pila){
        this.pila = pila;
    }
    
    public int evaluar(String readItem){
        String caracter, variableS;
        int cantidadE = 0;
        int variable = 0;
        int temp;
        for(int i = 0; i < readItem.length(); i++){
            caracter = Character.toString(readItem.charAt(i));
            if(caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8") || caracter.equals("9")){
                pila.push(caracter);
            }else if(caracter.equals("+")){
                cantidadE = pila.size();
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
                for(int j = 0; j <cantidadE; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp * variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }else if(caracter.equals("/")){
                cantidadE = pila.size();
                for(int j = 0; j <cantidadE; j++){
                    temp = Integer.parseInt((String) pila.pop());
                    variable = temp / variable;
                }
                variableS = Integer.toString(variable);
                pila.push(variableS);
            }
        }
        return Integer.parseInt((String) pila.pop());
    }
    
}

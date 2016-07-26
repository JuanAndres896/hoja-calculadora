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
 * Descripción: Esta clase implementa el contrato de la interfaz, en esta ocasion será implementado por medio de un ArrayList (donde se puede
 * trabajar con infinitos datos y se van agregando conforme se necesite) los metodos están arreglados de tal manera que funcione con este modo
 */
public interface Stack <E> 
{

   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack

}

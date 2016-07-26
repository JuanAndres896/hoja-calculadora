/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 25 de Julio del 2016
 * Descripción: Esta clase implementa el contrato de la interfaz, en esta ocasion será implementado por medio de un Vector (donde se puede
 * trabajar con infinitos datos y se van agregando conforme se necesite) los metodos están arreglados de tal manera que funcione con este modo
 */

import java.util.Vector;

public class StackVector <E> 
implements Stack<E>{
    
    protected Vector<E> data;

        public StackVector (){
            data = new Vector<E>();
        }
    
        @Override
	public void push(E item)
	// post: the value is added to the stack
	// will be popped next if no intervening push
	{
		data.addElement(item);
	}

        @Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

        @Override
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
        @Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
        @Override
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
    
}

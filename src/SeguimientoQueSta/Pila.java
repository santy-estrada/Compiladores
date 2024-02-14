package SeguimientoQueSta;

import java.util.Stack;

public class Pila<E> implements ILista<E> {

	
	private Stack<E> s = new Stack<E>();
	

	@Override
	public void agg(E e) {
		s.push(e);
	}

	@Override
	public E rem() {
		// TODO Auto-generated method stub
		return s.pop();
	}

	@Override
	public String toString() {
		return "Pila [s=" + s + "]";
	}
	

}

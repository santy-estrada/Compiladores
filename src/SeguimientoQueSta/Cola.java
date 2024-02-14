package SeguimientoQueSta;

import java.util.LinkedList;
import java.util.Queue;

public class Cola<E> implements ILista<E>{
	
	private Queue<E> q = new LinkedList <E>();


	@Override
	public E rem() {
		// TODO Auto-generated method stub
		return q.poll();
	}

	@Override
	public void agg(E e) {
		q.add(e);
		
	}

	@Override
	public String toString() {
		return "Cola [q=" + q + "]";
	}
	
	

}

package SeguimientoQueSta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILista<Integer> q = new Cola<Integer>();
		q.agg(5);
		q.agg(6);
		q.agg(8);
		System.out.println(q);
		q.rem();
		System.out.println(q);
		
		ILista<Integer> s = new Pila<Integer>();
		s.agg(5);
		s.agg(6);
		s.agg(8);
		System.out.println(s);
		s.rem();
		System.out.println(s);
	}

}

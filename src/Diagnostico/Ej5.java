package Diagnostico;

import java.util.LinkedList;
import java.util.Queue;

public class Ej5 {
	
	private static Queue<Character> strToQ(String s){
		Queue<Character> q = new LinkedList <Character>();
		for(int i = 0; i < s.length(); i++) {
			q.add(s.charAt(i));
		}
		
		return q;
	}
	
	public static char error(String s1, String s2) {
		Queue<Character> q1 = new LinkedList <Character>();
		Queue<Character> q2 = new LinkedList <Character>();
		
		if(s1.length() > s2.length()) {
			q1 = strToQ(s1);
			q2	= strToQ(s2);
		}else if(s1.length() < s2.length()){
			q1 = strToQ(s2);
			q2	= strToQ(s1);
		}else {
			return '\0';
		}
		
		char aux = '\0';
		boolean flag = true;
		while(!q2.isEmpty() && flag) {
			aux = q1.poll();
			if(aux != q2.poll()) {
				flag = false;
			}
		}
		
		return (q2.isEmpty())? q1.poll():aux;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="";
		String s2 = "a";
		
		System.out.println(error(s2,s1));
	}

}

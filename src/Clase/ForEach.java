package Clase;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		
		l.add(80);
		l.add(80);
		l.add(7);
		l.add(10);
		l.add(100);
		
		for(Integer i: l) {
			System.out.println(i);
		}
		System.out.println();
		
		l.stream().forEach(i -> System.out.println(i));
		
	}

}

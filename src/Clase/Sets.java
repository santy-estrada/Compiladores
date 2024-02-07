package Clase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		
		l.add(80);
		l.add(80);
		l.add(7);
		l.add(10);
		l.add(100);
		
		Set<Integer> s1 = new HashSet<>();
		//TreeSet (Orden), LinkedHashSet (Orden de llegada)
		s1.addAll(l);
		System.out.println(s1);
		
		//Too slow
		Set<Integer> s2 = new TreeSet<>();
		s2.addAll(l);
		System.out.println(s2);
		
		//Slower than HasSet<>()
		Set<Integer> s3 = new LinkedHashSet<>();
		s3.addAll(l);
		System.out.println(s3);
		
		

	}

}

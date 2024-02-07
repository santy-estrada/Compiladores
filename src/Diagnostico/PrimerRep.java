package Diagnostico;

import java.util.Arrays;

public class PrimerRep {
	
	//Búsqueda binaria recursiva
	private static int busquedaBinariaR(int[]a, int e, int index, int i, int j) {
		if(a[index] == e) {
			return index;
		}
		if(i > j) {
			return -1;
		}
		
		if(a[index] > e) {
			j = index -1;
			return busquedaBinariaR(a, e, (j-i)/2, i, j);
		}else {
			i = index +1;
			return busquedaBinariaR(a, e, (j+i)/2, i, j);
		}
	}
	
	public static int binarySearch(int[] a, int e) {
		int j = a.length-1;
		return busquedaBinariaR(a, e,j/2,0,j);
	}
	
	public static int primerRep(int[] n) {
		int[] aux = {n[0]};
		int i = 1;
		int search = -1;
		
		while(i < n.length && search == -1) {
			search = binarySearch(aux, n[i]);
			aux = Arrays.copyOf(aux, aux.length+1);
			aux[aux.length-1] = n[i];
			i++;
			
		}
			
		return (aux.length == n.length)? -1: aux[i-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = {5,1,5,1};
		System.out.println(primerRep(v));
	}

}

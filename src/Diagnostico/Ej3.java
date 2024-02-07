package Diagnostico;

import java.util.Arrays;

public class Ej3 {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		Eratostenes e = new Eratostenes();
		int primos[] = e.sieveOfEratosthenes(n);
		
		int sum = 0;
		int temp[] = {0,0};
		int index;
		int[] max = {Integer.MIN_VALUE,0};
		int cont = 0;
		
		while (cont < primos.length) {
			index = cont;
			while (index < primos.length && sum < n) {
				sum+= primos[index];
				temp[1]++;
				int i = binarySearch(primos, sum);

				if(i != -1) {
					temp[0] = sum;
				}
				
				index++;
			}
			
			if(temp[0] > max[0] && temp[1] > max[1]) {
				max = Arrays.copyOf(temp, temp.length);
			}
			
			temp[0] = 0;
			temp[1] = 0;
			sum = 0;
			cont++;
			
		}
		
		System.out.println(max[0] + " " + max[1]);
		
		
	}

}

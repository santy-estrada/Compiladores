package Diagnostico;

import java.util.Arrays;

public class NoRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] v = {1,2,3,4,5,6,8,9,8,6,5,4,3,1,7,7,2,10,10,11,11,13,12,13,12,9,50};
		int i = 0;
		Integer s = null;
		int temp;
		Arrays.sort(v);
		
		while(i < v.length-2 && s == null) {
			temp = v[i];
			if(temp != v[i+1]) {
				if(i == 0) {
					s = temp;
				}else if(temp != v[i-1]){
					s = temp;
				}
			}
			i++;
		}
			
			
		
		if (s == null) {
			s = v[v.length-1];
		}
		
		System.out.println(s);
	}

}

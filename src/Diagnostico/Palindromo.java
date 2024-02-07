package Diagnostico;

public class Palindromo {
	
	public static int pal(int a) {
		StringBuffer n = new StringBuffer (String.valueOf(a));
		n.reverse();
		return Integer.valueOf(n.toString());
	}
	
	public static int[] sumaPal(int n) {
		int pal = pal(n);
		int sum = n;
		int cont = 0;
		while(pal != sum) {
			sum += pal;
			pal = pal(sum);
			cont++;
		}
		
		int[] r = {sum, cont};
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 750;
		System.out.println(sumaPal(n)[0] + " "+  sumaPal(n)[1]);
	}

}

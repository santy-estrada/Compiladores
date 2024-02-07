package Diagnostico;

public class arboles {
	private static void spaces(int n) {
		for(int j = 0; j < n; j++) {
			System.out.print(" ");
		}
	}
	public static void arbolito(String s, int a) {
		int max = s.length();
		int spaces = (2*a-1)/2;
		int paso = 1;
		for(int i = 0; i < a; i++) {
			spaces(spaces);
			int index = 0;
			for(int j = 0; j < paso; j++) {
				System.out.print(s.charAt(index));
				if(j+1 < paso) {
					System.out.print(" ");
				}
	            index = (index + 1) % max;

			}
			System.out.println();
			paso++;
			spaces--;
			
		}
		
		spaces((2*a-1)/2);
		System.out.println("|");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "*@o.";
		arbolito(s, 30);
		
	}

}

// Java program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes
package Diagnostico;

public class Eratostenes {
	int[] sieveOfEratosthenes(int n)
	{
		// Create a boolean array "prime[0..n]" and
		// initialize all entries it as true. A value in
		// prime[i] will finally be false if i is Not a
		// prime, else true.
		boolean prime[] = new boolean[n + 1];
		int cant = 0;
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a
			// prime
			if (prime[p] == true) {
				// Update all multiples of p greater than or
				// equal to the square of it numbers which
				// are multiple of p and are less than p^2
				// are already been marked.
				for (int i = p * p; i <= n; i += p) {
					if(prime[i]) {
						prime[i] = false;
						cant++;
					}
					
				}
			}
		}

		cant = n - cant -1;
		int[] primos = new int[cant];
		int cont = 0;
		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				//System.out.print(i + " ");
				primos[cont] = i;
				cont++;
			}
		}
		
		return primos;
		
	}

	// Driver Code
	public static void main(String args[])
	{
		int n = 60;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		Eratostenes g = new Eratostenes();
		int[] prims = g.sieveOfEratosthenes(n);
		for(int i :prims) {
			System.out.print(i + " ");
		}
	}
}


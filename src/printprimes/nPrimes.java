package printprimes;
import java.util.ArrayList;
import java.util.Scanner;
public class nPrimes {
	public static void main(String[] args) {
		//init scan object to read user input
		final long startTime = System.nanoTime();
		Scanner scan = new Scanner(System.in);
		System.out.println("Show me primes up to: ");
		
		int N = Integer.parseInt(scan.nextLine());
		//init resizeable array with int type 
		ArrayList<Integer> nprimes = new ArrayList<>();
		//2 is prime
		nprimes.add(2);
		//Go through all odd integers, if int can be divided by number from array of primes
		//go to next int. 
		for (int i = 3; i<N; i+=2) {
			boolean prime = true;
			//for each x in nprimes check if it divides i
			for (Integer x : nprimes) {
				if (i % x == 0) {
					prime = false;
					break;
				}
			}
			//If prime is still true, add to list of primes
			if (prime == true){
					nprimes.add(i);  
				}
		}
		final long duration = System.nanoTime() - startTime;

		scan.close();
		//print the list
		System.out.println(nprimes);
		System.out.println(nprimes.size());
		System.out.println(duration/1000000000.000000);
	}
}
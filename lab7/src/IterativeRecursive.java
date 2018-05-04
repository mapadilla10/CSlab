/*Marko Padilla
 * CS lab 2401
 * Assignment 7 Implementing iterative and recursive versions of Fibonacci number computation then testing each case to get time complexity
 * 3/26/2018
 */

import java.util.Scanner;

public class IterativeRecursive {
	//main method
	public static void main(String[] args) {
		//scanner to read user input
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number ");
		int n = sc.nextInt();
		System.out.println("---------------------------------------------------------- ");
		//Print iteration
		System.out.println("Iterative method");
		long start = System.currentTimeMillis();
		// long start = System.nanoTime();

		System.out.printf("Index at %d = %d \n", n, FiboIterative(n));
		System.out.printf("Time in milli seconds %2d \n", System.currentTimeMillis() - start);

		System.out.println("---------------------------------------------------------- ");

		//Print recursive 
		System.out.println("Recursive method");
		start = System.currentTimeMillis();
		System.out.printf("Index at %d = %d \n", n, FiboRecursive(n));
		System.out.printf("Time in  milli seconds %2d \n", System.currentTimeMillis() - start);
		sc.close();
	}

	//Iteration method
	public static long FiboIterative(double n) {

		int a = 0;
		int b = 1; 
		int c = 1;

		for (int i = 0; i < n; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return a;
	}

	//Recursive method
	public static long FiboRecursive(int  n) {

		if (n < 2) 
			
			return n;

		return FiboRecursive(n - 1) + FiboRecursive(n - 2);
	}
}
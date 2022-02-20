package com.academic.practise;

//Fibonacci using recursive function
public class FibonacciRecursive {
	// Main method
	public static void main(String[] args) {
		int n = 10;

		for (int i = 0; i < n; i++) {
			System.out.println(recursive(i) + "");
		}
	}

	// need to definea function that calls itself and performs operations

	// recursive method
	static int recursive(int n) {

		if (n <= 1)
			return n;

		return recursive(n - 1) + (n - 2);

	}

}

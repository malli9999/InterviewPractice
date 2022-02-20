package com.academic.practise;

import java.util.ArrayList;

// Program to find out prime numbers
public class PrimeNumbers {
	/**
	 * Given a number N, find all prime numbers upto N ( N included ). Example:if N
	 * = 7, all primes till 7 = {2, 3, 5, 7} Make sure the returned array is sorted.
	 */
	static boolean isPrime(int n)
	{
	// Corner case
	if (n <= 1)
	    return false;
	 
	// Check from 2 to n-1
	for (int i = 2; i < n; i++)
	    if (n % i == 0)
	        return false;
	 
	return true;
	}
	 
	static void printPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {
		int n = 7;
		printPrime(n);
	}
}

package com.academic.practise;

//Fibonacci using iterative approach
public class Fibonacci {
	// Logic for Fibonacci Series
	static void fibb(int n) {
		int start = 0, second = 1;
		int counter = 0;

		while (counter < n) {

			System.out.print(start + "\t");
			int third = second + start;
			start = second;
			second = third;
			counter = counter + 1;
		}
	}

	public static void main(String[] args) {
		fibb(10);
	}

}

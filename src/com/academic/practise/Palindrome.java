package com.academic.practise;

/* way of approach
 * Extract every character in a Given String 
 * Store it in a temp string
 * compare every character in original string vs 
 * temp string
 * if true palindrome else,
 * not palindrome*/

//program to check given string is palindrome or not 
public class Palindrome {

	public static void main(String[] args) {

		String input = "mom";
		String temp = "";
		System.out.println("Input String : "+input);
		//For loop for iterating the string 
		for (int i = input.length() - 1; i >= 0; i--) {
			temp += input.charAt(i);
		}
		System.out.println("Reversed String : "+ temp);
		boolean palindrome = true;
		//For loop to interatre and compare temp and original string
		for(int i=0; i<input.length(); i++) {
			//Comparing the input string and the temp
			if(input.charAt(i) != temp.charAt(i)) {
				palindrome = false;
			}
		}
		if(palindrome) {
			System.out.println("Provided input is palindrome!");
		}
		else {
			System.out.println("Provided input is not palindrome");
		}
	}

}

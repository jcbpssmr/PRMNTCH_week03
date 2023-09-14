package week03;

import java.util.Scanner;

public class week03_labs_01 {
	
	static Scanner sc = new Scanner(System.in);
	static String x = "";
	//private static boolean ;
	//static boolean yes = true;

	public static void main(String[] args) {
		// Arrays:
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int [] numbers = {1, 5, 2, 8, 13, 6};
		// 2. Print out the first element in the array
		System.out.println(numbers[0]);
		// 3. Print out the last element in the array without using the number 5
		System.out.println(numbers[numbers.length - 1]);
		// 4. Print out the element in the array at position 6, what happens?
		//IT WILL THROW AN ERROR
		// 5. Print out the element in the array at position -1, what happens?
		//IT WILL ALSO THROUGH AN ERROR
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Values in array: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println();
		System.out.println("Values in array: ");
		for (int i : numbers) {
			System.out.print(i + ", ");
		}
		System.out.println();
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		double sum = 0;
		for (int i : numbers) {
			sum = sum + i;
		}
		System.out.println("Sum of numbers array: ");
		System.out.println(sum);
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum/(numbers.length);
		System.out.println("The average of numbers array is: " + average);
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println("The odd numbers are: ");
		for (int i : numbers) {
			if (i % 2 == 1) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String [] names = {"Sam", "Sally", "Thomas", "Robert"};
		// 12. Calculate the sum of all the letters in the new array
		//You can't sum letters
		int sum2 = 0;
		for (String name : names) {
			int len = name.length();
			sum2 = len + sum2;	
		}
		System.out.println("Total sum of letters in array");
		System.out.println(sum2);
		
		greet("Jacob");
		System.out.println(greet2("kill bot"));
		System.out.println(compare("bob", 5));
		String [] list = {"a", "b", "c"};
		System.out.println(exists(list , "d"));
	}
	

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 	//			This method returns nothing.
	
	

	public static void greet(String name) {
		System.out.println("Hello " + name +"!");
		
		
	}
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
	public static String greet2 (String name) {
		return ("Hi " + name +"!");
		
	}
	
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
	public static boolean compare (String word, int num) {
		if (word.length() > num) {
			return true;
		} else {
			return false;
		}
	}
		

		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
	public static boolean exists (String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			} 
				
		
		}
		return false;
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

	
	}
}

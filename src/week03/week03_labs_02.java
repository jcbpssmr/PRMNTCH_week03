package week03;

import java.util.Arrays;

public class week03_labs_02 {

	public static void main(String[] args) {
		//System.out.println("test");
		//thisIsAMethod("Testing the method");
		//int [] numbers = {5,6,8,3,2,-1,-100};
		String [] match = {"one", "two", "three", "four", "five","no","no"};
		//smallestInArray(numbers);
		//arrayAverage(numbers);
		matching(match);
		//System.out.println(summing(match));
		//System.out.println(reverseString("racecar"));
		//System.out.println(isPalindrome("racecar"));

	}
	public static void thisIsAMethod (String test) {
		System.out.println(test);
	}
	
	// 17. Write and test a method that takes an array of int and 
			//			returns the smallest number in the array
	public static void smallestInArray (int[] numbers) {
		int smallest = numbers[0];
		for (int i : numbers) {
			if (i < smallest) {
				smallest = i;
			}
		}System.out.println(smallest);
	}
	
	// 18. Write and test a method that takes an array of double and returns the average
	public static void arrayAverage(int[] numbers) {
		double sum = 0;
		for (double i : numbers) {
			sum = sum + i;	
		} double average = sum/numbers.length;
		System.out.println(average);
	}
	// 19. Write and test a method that takes an array of Strings and 
			//returns an array of int where each element
			//matches the length of the string at that position
	
	public static void matching(String[] strings) {
		int[] arr = {};
		for (String s : strings) {
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length-1] = s.length();
		}System.out.println(Arrays.toString(arr));
	}
	// 20. Write and test a method that takes an array of strings and 
			//			returns true if the sum of letters for all strings with an even amount of letters
			//			is greater than the sum of those with an odd amount of letters.
	public static boolean summing (String[] strings) {
		int sumEven = 0 ;
		int sumOdd = 0;
		for (String s : strings) {
			if (s.length() % 2 == 0) {
				sumEven += s.length();
			}else {
				sumOdd += s.length();
			}
	      }
		return sumEven > sumOdd;
	}
	// 21. Write and test a method that takes a string and returns true if the string is a palindrome
	public static boolean isPalindrome (String string) {
		if (string.equals(reverseString(string))) {
			return true;
		}else {
			return false;
		}
	
		
	}
	//Method to reverse strings
	public static String reverseString(String string) {
		String ogString = string;
		StringBuilder revString = new StringBuilder(ogString);
		revString.reverse();
		String revString2 = revString.toString();
		return revString2;
	}
}
	
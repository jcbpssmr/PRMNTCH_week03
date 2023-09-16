package week03;

import java.util.Arrays;

public class week03_homework_01 {

	public static void main(String[] args) {
		//System.out.println("This is my main.");
		//repeatWord("stop", 3);
		//fizzBuzz(2);
		//System.out.println(orderTotal(12.3, 23.4, 45.6, .09));
		//int digits = 2456;
		//System.out.println(sumOfDigits(digits));
		//System.out.println(passwordChecker("234567!"));
		//String [] names = {"Brianne", "Jacob", "Denham", "Dillan", "Emmalee"};
		//System.out.println(avgNameLength(names));
		//System.out.println(rectanglePerimeter(100,22));
		//int [] arr = {1,2,3,4,5};
		//printTwice(arr, 2);
		//changeTwo(12,13,arr);
		//charArray("String");
		//System.out.println(wordToArray("String"));
		//System.out.print(Arrays.toString(buildArray(8)));
		//String [] arr = {"four", "five", "six"};
		//newArray("one", "two", "three", arr);
		//reverseAnArray(1,2,3,4,5);
		

	
	}
	//******************************************* METHODS STORAGE AREA ******************************************************
	//Question 1
	public static void repeatWord(String userWord, int numTimes) {
		for (int i = 0; i<=numTimes; i++ ) {
			System.out.print(userWord);
			System.out.println();
		}
	}
	//Question 2
	public static void fizzBuzz (int num1) {
		if (num1 % 3 == 0 && num1 % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (num1 % 3 == 0) {
			System.out.println("Fizz");
		} else if (num1 % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println("Hello World!");
		}
	}
	//Question 3
	public static double orderTotal (double x,double y,double z, double a) {
		double sum = (x+y+z)*(1+a);
		return sum;
		
	}
	// Question 4
	public static int sumOfDigits (int digits) {
		int sum = 0;
		digits = Math.abs(digits); // pull out the digits
		while (digits > 0) {
			int lastDigit = digits%10; // get the last digit
			sum += lastDigit; // sum the digits
			digits/=10; // remove the zero
		}
		return sum;
	}
	//Question 5
	public static boolean passwordChecker (String password) {
		int passwordLen = password.length();
		boolean specialChar = false;
		for (int i = 0; i < password.length(); i++) {
			char character = password.charAt(i);
			if (character == '!' || character == '$' || character == '%' || character == '&' ) {
				specialChar = true;
			}
		}if (passwordLen >= 8 && specialChar == true) {
			return true;
		} else {
			return false;
		}
	}
	//Question 6
	public static double avgNameLength (String[] names) {
		double [] arr = {};
		double sum = 0;
		for (String s : names) {
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length-1] = s.length();
		}for (double i : arr) {
			sum = sum + i;
		}
		return sum/arr.length;
	}
	// Question 7
	public static int rectanglePerimeter (int length, int width) {
		int perimeter = length*width;
		return perimeter;
	}
	//Question 8
	public static void printTwice (int[] arr, int x) {
		for( int i : arr) {
			System.out.println(i);
		}
		for (int i : arr) {
			System.out.println(i+x);
		}
	}
	
	//Question 9
	public static void changeTwo ( int a, int b, int[] arr) {
		arr[0] = a;
		arr[arr.length - 1] = b;
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}
	
	//Question 10
	public static void charArray (String userWord) {
		char[] arr = userWord.toCharArray();
		for (char i : arr) {
			System.out.println(i);
		}
	}
	
	//Question 11
	public static char[] wordToArray(String userWord) {
		return userWord.toCharArray();
		
	}
	//Question 12 
	public static int[] buildArray(int num) {
		int [] numArray = new int[num];
		for (int i=0; i< num; i++) {
			numArray[i] = i;
			
		}
		return numArray;
	}
	//Question 13
	public static int createInt (int num1, int num2, int num3, int num4, int num5, int num6) {
		int[] arrayInt = {num1,num2,num3,num4,num5,num6};
	    return arrayInt [arrayInt.length-1];
	}
	public static void newArray(String word1, String word2, String word3, String [] arr) {
		String [] newArr = {word1,word2,word3};
		int length = newArr.length + arr.length;
		String [] toYourLiking = new String[length];
		for (int i=0; i<newArr.length; i++) {
			toYourLiking[i] = newArr[i];
		}
		for (int i = 0; i<arr.length; i++) {
			toYourLiking[i+newArr.length] = arr[i];
		}
		for (String i : toYourLiking ) {
			System.out.println(i);
		}
	
	}
	// Question 14 -reverse an array
	public static void reverseAnArray(int a, int b, int c, int d, int e) {
		int pos = 0;
		int [] arr = {a,b,c,d,e};
		int [] reverseArr = new int[arr.length];
		for (int i = 0; i<5; i++) {
			reverseArr[i] = arr[4-pos];
			pos = pos + 1; 
		}
		for (int i = 0; i<reverseArr.length; i++) {
			System.out.println(reverseArr[i]);
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	// multidimensional arrays
	

}

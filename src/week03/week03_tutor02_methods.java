package week03;

public class week03_tutor02_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] myArray = {7,10,8};
	double [] grades = {88.7,92.5,100,67.3,78.9};
	
	System.out.println(sumArray(myArray));
	System.out.println(calculateAverage(grades));
	System.out.println(multiplyString("Hello ", 3));
	}
	// Method to sum the integer in a list 
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	// method to return average of an array
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number :numbers) {
			sum += number;
		}
		double average = sum/numbers.length;
		return average;
	}
	//A method to return a concatenated string
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
			
	}
}

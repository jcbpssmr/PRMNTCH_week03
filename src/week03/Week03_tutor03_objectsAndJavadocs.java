package week03;

public class Week03_tutor03_objectsAndJavadocs {

	public static void main(String[] args) {
		 // a 2D Array with 3 rows and 4 columns
        int[][] numbers = {{11, 12, 13, 14},
                           {21, 22, 23, 24},
                           {31, 32, 33, 34}};

        // print out the elements in the Array
        for (int i = 0; i < numbers.length; i++) {
           for (int j = 0; j < numbers[i].length; j++) {
              // prints the columns of a row
              System.out.print(numbers[i][j] + " ");
           }
           // prints each row on a new line
           System.out.println();
           
        }
		

	}

}

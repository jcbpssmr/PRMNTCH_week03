package week03;

public class week03_tutor {

	public static void main(String[] args) {
		//String [] students = new String [3];
		//Arrays *****************************************************************************
//		 students[0] = "Tom Sawyer";
//		 students[1] = "Jack Smith";
//		 students[2] = "Bill Turner";
//		 
//		 for (String student : students ) {
//			 System.out.println(student);
//		 }
//		 
//		int [] integers = {1,2,3,4,5};
//		
//		for ( int i : integers) {
//			System.out.println(i);
//		}
//		 
//		String [] names = {"Jacob", "Denham", "Dillan"};
//		
//		for (String name : names) {
//			System.out.println(name);
//		}
//		
//		System.out.println(names.length);
  
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName,lastName);
		System.out.println(fullName);

	}
	public static String createFullName(String x, String y) {
		return x + " " + y;
		
	}
}
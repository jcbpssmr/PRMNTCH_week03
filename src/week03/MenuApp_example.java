package week03;

import java.util.Scanner;

public class MenuApp_example {
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	// While loop where menu is stored.
	public static void main(String[] args) {

		// Add a team member
		// View a team member
		// View all team members
		// Delete team member by position
		// Delete all team members
		
		String[] team = new String[5] ;
		
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
			if (decision <- 1 || decision > 5) {
				System.out.println("Pick a valid option");
			}else if (decision==1) {
				showTeam(team);				
			}else if (decision==2) {
				showTeamMember(team);				
			}else if (decision==3) {
				if (addingIndex >= team.length) {
					System.out.print("Your team is full select another option");
				} else {
				addTeamMember(team);
				}
				
			}else if (decision==4) {
				deleteTeamMember(team);
				
			}else if (decision==5){
				deleteAllTeamMembers(team);
				
			}else {
				System.out.println("Not a valid entry. Enter a number between 1 and 5, or -1 to quit");
				showMenu();
			
			}
			
			
		}
// METHODS STORAGE AREA****************************************************************************************
		
	}
	public static void deleteAllTeamMembers(String[] team) {
		for (int i = 0; i<team.length; i++) {
			team[i]= null;
			addingIndex = 0;
		}
		System.out.println("deleting all team members");
		showTeam(team);
	}
	public static void deleteTeamMember(String[] team) {
		System.out.println("What team member do you want to delete? ");
		int memberToDelete = s.nextInt();
		if (isValid(memberToDelete)) {
			team[(memberToDelete)] = null;
			addingIndex = addingIndex-1;
		}
		showTeam(team);
		
		
	}
	//Method to add a team member
	public static void addTeamMember(String[] team) {
		System.out.print("Enter new member name here: ");
		String newMember = s.next();
		if (isValid(addingIndex)) {
		team[addingIndex++] = newMember;
		showTeam(team);
		} else {
			System.out.println("Invalid entry");
		}
	}
	//Method to show team members by position in an array
	public static void showTeamMember(String[] team) {
		System.out.println("Enter team number: ");
		int teamNumber = s.nextInt();
		if (isValid(teamNumber)) {
			System.out.println(teamNumber + " - " +team[teamNumber]);
		} else {
			System.out.print("Not a valid entry. Please enter a number between: 0 & " + (team.length-1) + ": ");
			teamNumber = s.nextInt();
		}
		
	}
	//Method to show whole team list
	public static void showTeam(String[] team) {
		System.out.println("Team Members: ");
		for (int i = 0; i<team.length; i++) {
			System.out.println((i+1) + ": " + team[i]);
		}
	}
	//method to check if user selections are valid.
	public static boolean isValid(int input) {
		if (input >=0 && input < 5) {
			return true;
		}else {
			return false;
		}
	}
		
	
		
	

	// Method to show the menu options.
	public static void showMenu() {
		System.out.println("Pick an option or enter -1 to exit");
		System.out.println("1) Show Team. ");
		System.out.println("2) View a team member. ");
		System.out.println("3) Add a team member ");
		System.out.println("4) Delete a team member by position. ");
		System.out.println("5) Delete all team members. ");
		
	}

}

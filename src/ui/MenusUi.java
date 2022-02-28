package ui;

import java.util.Scanner;

public class MenusUi {

	
	
	/**
	 * Method that creates the menu of the application
	 **/
	public void menu() {
		@SuppressWarnings("resource")
		//create scanner for reading the inputs
		Scanner scanner = new Scanner(System.in);
		// true variable that closes the application menu
		boolean isOn = true;
		while (isOn) {
			//menu string
			String mainMenu = "0.Exit\n1.Configuration\n2.Operational";
			System.out.println(mainMenu);
			//read the options
			int choice = scanner.nextInt();
			
			//display menus
			switch (choice) {
			case 1: {
				//configuration menus
				configMenu();
				break;
			}
			case 2: {
				//operation menus
				operationalMenu();
				break;
			}
			case 0: {
				return;
			}
			default: {
				//close menu
				isOn = false;
				break;
			}
			}
			System.out.println();
		}
	}

	/**
	 * Method specific for the configuration menu
	 */
	public void configMenu() {
		@SuppressWarnings("resource")
		//scanner for taking the input
		Scanner scanner = new Scanner(System.in);
		// true variable that closes the menu
		boolean isOn = true;
		String buyPrompt = "0.Back\n1.View family members\n2.Add family member\n3.Rename family member\n4.Monthly Spending Limit";
		while (isOn) {
			//menu string
			System.out.println(buyPrompt);
			int choice = scanner.nextInt();
			switch (choice) {
			case 0: {
				//back
				return;
			}
			case 1: {
				// code for View family members
				break;
			}

			case 2: {
				// code for Add family member
				break;
			}
			case 3: {
				// code for Rename family member
				break;
			}

			case 4: {
				// code for Rename family member
				break;
			}
			default:
				break;
			}
		}
	}
	
	/**
	 * Method specific for the operational menu
	 */
	public void operationalMenu() {

		@SuppressWarnings("resource")
		//scanner
		Scanner scanner = new Scanner(System.in);
		//true variable for the menu
		boolean isOn = true;
		String buyPrompt = "0.Back\n1.Select family member";
		while (isOn) {
			System.out.println(buyPrompt);
			int choice = scanner.nextInt();
			switch (choice) {
			case 0: { 
				//back
				return;
			}
			case 1: {
				// code for Select family member
				break;
			}

			default:
				break;
			}
		}
	}
	
	/**
	 * Menu for the members
	 */
	public void memberMenu() {

		@SuppressWarnings("resource")
		//scanner
		Scanner scanner = new Scanner(System.in);
		//true variable for the menu
		boolean isOn = true;
		String buyPrompt = "0.Back\n1.Reporting\n2.Add income\n3.Add expense";
		while (isOn) {
			System.out.println(buyPrompt);
			int choice = scanner.nextInt();
			switch (choice) {
			case 0: {//back
				return;
			}
			case 1: {
				// code for Reporting
				break;
			}
			case 2: {
				// code for Add income
				break;
			}
			case 3: {
				// code for Add expense
				break;
			}
			default:
				break;
			}
		}
	}
	
	/**
	 * Method for the reports
	 */
	public void reportingMenu() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean isOn = true;
		String buyPrompt = "0.Back\n1.View remaining budget\n2.View incomes\n3.View expenses\n4.Aggregated Statistics";
		while (isOn) {
			System.out.println(buyPrompt);
			int choice = scanner.nextInt();
			switch (choice) {
			case 0: {//back
				return;
			}
			case 1: {
				// code for View remaining budget
				break;
			}

			case 2: {
				// code for View incomes
				break;
			}
			case 3: {
				// code for View expenses
				break;
			}
            
			case 4: {
				// code for Aggregated Statistics
				break;
			}
			default:
				break;
			}
		}
	}
	
}
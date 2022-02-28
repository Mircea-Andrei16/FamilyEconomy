package ui;

import java.util.Scanner;

public class FamilyUI {

	public void menu() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean isOn = true;
		while (isOn) {
			String mainMenu = "0.Exit\n1.Configuration\n2.Operational";
			System.out.println(mainMenu);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				configMenu();
				break;
			}
			case 2: {
				operationalMenu();

				break;
			}
			case 0: {

				return;
			}
			default: {
				isOn = false;
				break;
			}
			}
			System.out.println();
		}
	}

	public void configMenu() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean isOn = true;
		while (isOn) {
			String buyPrompt = "0.Back\n1.View family members\n2.Add family member\n3.Rename family member\n4.Monthly Spending Limit";
			System.out.println(buyPrompt);
			int choice = scanner.nextInt();
			switch (choice) {
			case 0: {//back
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
	
	public void operationalMenu() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean isOn = true;
		while (isOn) {
			String buyPrompt = "0.Back\n1.Select family member";
			System.out.println(buyPrompt);
			int choice = scanner.nextInt();
			switch (choice) {
			case 0: { //back
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
	
	
	public void memberMenu() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean isOn = true;
		while (isOn) {
			String buyPrompt = "0.Back\n1.Reporting\n2.Add income\n3.Add expense";
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
	
	
	public void reportingMenu() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean isOn = true;
		while (isOn) {
			String buyPrompt = "0.Back\n1.View remaining budget\n2.View incomes\n3.View expenses\n4.Aggregated Statistics";
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
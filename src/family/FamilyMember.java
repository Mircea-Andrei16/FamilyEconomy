package family;

import java.util.Scanner;

public class FamilyMember {
	
	/**
	 * expenses for a family member
	 */
	private int expenses;
	
	/**
	 * income of a family memeber
	 */
	private int income;
	
	/**
	 * name of the family member
	 */
	private String name;
	
	/**
	 * Constructor
	 * @param name of the family member
	 */
	public FamilyMember(String name) {
		this.name = name;
	}

	public void displayMember() {
		System.out.println("person: " + name);
		
	}

	/**
	 * @return the expenses
	 */
	public int getExpenses() {
		return expenses;
	}

	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	/**
	 * @return the income
	 */
	public int getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(int income) {
		this.income = income;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void opMenu() {
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
			    this.reportMenu();
				break;
			}
			case 2: {
				int income=scanner.nextInt();
				setIncome(income);
				break;
			}
			case 3: {
				int expense=scanner.nextInt();
				setExpenses(expense);
				break;
			}
			default:
				break;
			}
		}
		
	}

	private void reportMenu() {
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
				getIncome();
				break;
			}
			case 3: {
				getExpenses();
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

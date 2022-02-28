package family;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FamilyMember {

	/**
	 * expenses for a family member
	 */
	private int expenses = 0;

	/**
	 * income of a family member	
	 */
	private int income = 0;

	/**
	 * name of the family member
	 */
	private String name;

	/**
	 * family of the family member
	 */
	private Family family;

	/**
	 * Constructor
	 * @param name of the family member
	 */
	public FamilyMember(String name, Family family) {
		this.name = name;
		this.family = family;
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
			case 0: {
				//back
				return;
			}
			case 1: {
				this.reportMenu();
				break;
			}
			case 2: {
				int income = scanner.nextInt();
				family.limitIncome(income);
				family.addSpendingLimit(family.getLimit() + income);
				setIncome(income);
				break;
			}
			case 3: {
				int expense = scanner.nextInt();
				family.limitExpenses(expense);
				family.addSpendingLimit(family.getLimit() - expense);
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
				System.out.println("Remaining buget: " + family.getLimit());
				break;
			}

			case 2: {
				System.out.println("Income:" + getIncome());
				break;
			}
			case 3: {
				System.out.println("Expenses:" + getExpenses());
				break;
			}

			case 4: {
				System.err.println("Total income: "    + family.getTotalIncome() + "\n"
						+ "Total expenses: "  + family.getTotalExpense() + "\n" 
						+ "Highest expense: " + family.getMaximalExpense()+ "\n" 
						+ "Lowest expense: "  + family.getMinimalExpense());
				break;
			}
			default:
				break;
			}
		}
	}
	
	/**
	 * Add members in data base
	 */
	public void addInDB() {
		try {
			FileWriter myWriter = new FileWriter("src/appData.dat");
			String dataForDB = income + "\n" + expenses + "\n";
			myWriter.write(dataForDB);
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

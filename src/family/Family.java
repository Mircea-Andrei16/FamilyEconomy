package family;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family {

	/**
	 * limit of the spending
	 */
	private int limit;

	/**
	 * Number of members
	 */
	private int numberOfMembers;

	/**
	 * scanner
	 */
	private Scanner scanner = new Scanner(System.in);

	/**
	 * List of family members
	 */
	private List<FamilyMember> familyMembers = new ArrayList<>();

	/**
	 * list of members
	 */
	private String[] listMember;

	/**
	 * maximalIncome
	 */
	private int maximalIncome = 0;

	/**
	 * minimalIncome
	 */
	private int minimalIncome = 1000;

	/**
	 * maximalExpense
	 */
	private int maximalExpense = 0;

	/**
	 * minimalExpense
	 */
	private int minimalExpense = 1000;

	/**
	 * totalIncome
	 */
	private int totalIncome = 0;

	/**
	 * totalExpense
	 */
	private int totalExpense = 0;

	/**
	 * Constructor
	 * @param limit
	 * @param member
	 */
	public Family(int limit, String[] member) {
		this.limit = limit;
		this.listMember = member;
		this.numberOfMembers = member.length;
		createMembersConfig();
	}

	/**
	 * Empty constructor
	 */
	public Family() {
	}

	/**
	 * create the member list using the config text
	 */
	private void createMembersConfig() {

		for (int i = 0; i < listMember.length; i++) {
			String name = listMember[i];
			FamilyMember newFamilyMember = new FamilyMember(name,this);
			familyMembers.add(newFamilyMember);
		}
	}

	public void viewFamilyMembers() {
		for (FamilyMember familyMember : familyMembers) {
			System.out.println(familyMember.getName() + "\n");
		}
	}

	/**
	 * add a family member
	 */
	public void addFamilyMember() {
		// create a new family member
		String name = scanner.next();
		numberOfMembers++;
		FamilyMember newFamilyMember = new FamilyMember(name,this);
		// add the member in the list
		familyMembers.add(newFamilyMember);
	}

	/**
	 * remove a family member
	 * 
	 * @param name
	 */
	public void removeFamilyMember(String name) {
		int number = 0;
		for (FamilyMember familyMember : familyMembers) {
			if (name.equals(familyMember.getName())) {
				familyMembers.remove(number);
				numberOfMembers--;
				break;
			}
			number++;
		}
	}

	/**
	 * add a spending limit
	 * 
	 * @param limit
	 */
	public void addSpendingLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * Method that creates the config file
	 */
	public void createConfigFile() {
		try {
			// file writer
			File configFile = new File("src/config.txt");
			configFile.delete();

			FileWriter configWriter = new FileWriter("src/config.txt");
			// create a string with the limit and the number of memebers
			String configString = limit + "\n" + numberOfMembers + " ";

			int number = 0;
			// add the names of the memebers
			for (FamilyMember familyMember : familyMembers) {
				number++;
				configString = configString + familyMember.getName();
				if (number <= numberOfMembers - 1) {
					configString = configString + "\n";
				}
			}

			// write the name in the file
			configWriter.write(configString);
			configWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Select member to add income and expanses
	 */
	public void selectMember() {
		int number = 0;
		String configString="";
		// add the names of the members
		for (FamilyMember familyMember : familyMembers) {
			number++;
			configString = configString +number +"." + familyMember.getName();
			if (number <= numberOfMembers - 1) {
				configString = configString + "\n";
			}
		}

		String buyPrompt = "0.Back\n"+configString;
		
		System.out.println(buyPrompt);
		int choice=scanner.nextInt();
		int counter=0;
		//choose the member
		for (FamilyMember familyMember : familyMembers) {
			counter++;
			if(counter==choice)
			{
				familyMember.opMenu();
				familyMember.addInDB();
			}
		}
	}

	/**
	 * Get the limit
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * find maximal and minimal income
	 * @return the limit
	 */
	public void limitIncome(int income) {
		
		totalIncome += income;
		
		if(income > maximalIncome) {
			maximalIncome = income;
		}
		
		if(income < minimalIncome) {
			minimalIncome = income;
		}
		
	}

	/**
	 * find maximal and minimal expense
	 * @param expense
	 */
	public void limitExpenses(int expense) {
		
		totalExpense += expense;
		
		if(expense > maximalExpense) {
			maximalExpense = expense;
		}
		
		if(expense < minimalExpense) {
			minimalExpense = expense;
		}
		
	}

	/**
	 * @return the totalIncome
	 */
	public int getTotalIncome() {
		return totalIncome;
	}

	/**
	 * @return the totalExpense
	 */
	public int getTotalExpense() {
		return totalExpense;
	}

	/**
	 * @return the maximalIncome
	 */
	public int getMaximalIncome() {
		return maximalIncome;
	}

	/**
	 * @return the minimalIncome
	 */
	public int getMinimalIncome() {
		return minimalIncome;
	}

	/**
	 * @return the maximalExpense
	 */
	public int getMaximalExpense() {
		return maximalExpense;
	}

	/**
	 * @return the minimalExpense
	 */
	public int getMinimalExpense() {
		return minimalExpense;
	}
}

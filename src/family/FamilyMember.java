package family;

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
}

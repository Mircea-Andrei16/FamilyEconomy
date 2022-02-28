package family;

public class FamilyMember {
	
	/**
	 * expenses for a family member
	 */
	private int expenses;
	
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

	public String getName() {
		return name;
	}

}

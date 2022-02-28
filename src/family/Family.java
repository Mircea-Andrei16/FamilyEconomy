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
			FamilyMember newFamilyMember = new FamilyMember(name);
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
		//create a new family member
		String name = scanner.next();
		numberOfMembers++;
		FamilyMember newFamilyMember = new FamilyMember(name);
		//add the member in the list
		familyMembers.add(newFamilyMember);
	}

	/**
	 * remove a family member
	 * @param name
	 */
	public void removeFamilyMember(String name) {
		int number = 0;
		for (FamilyMember familyMember : familyMembers) {
			if(name.equals(familyMember.getName())) {
				familyMembers.remove(number);
				numberOfMembers--;
				break;
			}
			number++;
		}
	}

	/**
	 * add a spending limit
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
			//file writer
			File configFile = new File("src/config.txt");
			configFile.delete();
			
			FileWriter configWriter = new FileWriter("src/config.txt");
			//create a string with the limit and the number of memebers
			String configString = limit + "\n" + numberOfMembers + " ";
			
			int number = 0;
			//add the names of the memebers
			for (FamilyMember familyMember : familyMembers) {
				number++;
				configString = configString + familyMember.getName();
				if(number <= numberOfMembers - 1) {
					configString = configString + "\n";
				}
			}
			
			//write the name in the file
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
		//add code
	}

}

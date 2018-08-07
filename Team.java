/*
 * The Team Class contains two data elements: the name of the team and 
 * the number of wins. The class has a toString method which must be 
 * written by as part of Project6.
 * 
 * To use this class, you can drag and drop it into the default package 
 * in your Eclipse installation, or create a new class named Team and 
 * copy/paste the contents of this file into that new class.
 * 
 * @author Sarah Wu, University of Oklahoma, CS 1323 Summer 2018
 */
public class Team implements Comparable<Team> {
	// _-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_-v-_
	// CS 1323: Implement this method

	/**
	 * This is the method you will fix to allow you to return the contents of
	 * this Team item in the nice format: "name: winCount".  The current 
	 * implementation will allow the program to compile, but it returns nothing.
	 * 
	 * For example: "Sooners: 3"
	 * 
	 * @return the formatted String that can then be output to the console.
	 */
	public String toString() {						//FIXED
		String output = name + ": " + winCount;		
													
		return output;
	}
	// _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_

	// Data fields
	private String name;
	private int winCount;

	// Constructors ---------------------------------------
	/*
	 * I have implemented many constructors to accommodate all of the different
	 * design choices. You will likely only use one of these in your code.
	 */
	Team() {
		name = "Sooners";
		winCount = 1;
	}

	Team(String inputName) {
		name = inputName;
		winCount = 1;
	}

	Team(String inputName, int inputWinCount) {
		name = inputName;
		winCount = inputWinCount;
	}
	
	// ----------------------------------------------------
	// Getters and Setters (aka Accessors and Mutators) ===
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the winCount
	 */
	public int getWinCount() {
		return winCount;
	}

	/**
	 * @param winCount
	 *            the winCount to set
	 */
	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	/**
	 * Increments the winCount variable by one for this Team
	 */
	public void incrementWinCount() {
		winCount++;
	}

	/**
	 * This method allows you to check to see if this Team object has the same
	 * name as another Team object.
	 * 
	 * This method allows you to use the contains method in ArrayList to see
	 * if any element in an array list has the same name as a specific Team.
	 * 
	 * @param o
	 *            the other Team being compared to.
	 */
	@Override
	public boolean equals(Object o) {
		return name.equals(((Team) o).name);
	}

	/**
	 * This method allows you to check to see if this Team object has the same
	 * name as another Team object
	 * 
	 * @param otherTeam
	 *            one team
	 */
	public boolean sameName(Team otherTeam) {
		return name.equals(otherTeam.name);
	}
	/**
	 * This method allows you to check to see if this Team object has the same
	 * name as another Team object
	 * 
	 * @param team1
	 *            one team
	 * @param team2
	 *            the other team
	 */
	public static boolean sameName(Team team1, Team team2) {
		return team1.name.equals(team2.name);
	}

	/**
	 * This method allows you to sort an ArrayList of Team items using
	 * Collections.sort
	 * 
	 * @param o
	 *            the other Team being compared to.
	 * @return -1 if this Team item should come first, +1 if this Team item
	 *         should come after the other, and 0 if this Team item is
	 *         equivalent to the other.
	 */
	@Override
	public int compareTo(Team o) {
		if (this.winCount < o.winCount) {
			return -1;
		} else if (this.winCount > o.winCount) {
			return 1;
		}
		return 0;
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

public class Project6_JakeWarren {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name = null;

		System.out.println("Welcome to the Advanced Sportsball Tracker!");
		System.out.println("Which team just won? (x to exit)");
			
		name = keyboard.next();								
			
		ArrayList<Team> teams = new ArrayList<>();

		while(!name.equals("x")) {										// Sentinel Value

			Team myteam = new Team(name);								// winCount's first appearance
						
			if(teams.contains(myteam)) {								// Process Team Wins
				int teamIndex = teams.indexOf(myteam);
				myteam = teams.get(teamIndex);
				myteam.incrementWinCount();
			}			
			else {
				teams.add(myteam);
			}			

			System.out.println("Which team just won? (x to exit)");		// Ask for(); Input at the end of the while loop
			name = keyboard.next();
	
		}
				
		if(name.equals("x")) {											// Sort and Output Data
			Collections.sort(teams);
			Collections.reverse(teams);
	
			if(teams.isEmpty()) {
				System.out.println("You didn't provide input.");
			}
			else {						
				int mostWins = teams.get(0).getWinCount();				// Variables
				int winningTeam = 0;							
			
				int i = 1;
				while( i < teams.size() && mostWins == teams.get(i).getWinCount()) {
					i++;
				}
				winningTeam = (int)(Math.random()* i);						
				System.out.println("Final Tally:");
				System.out.print("The winner is the " + teams.get(winningTeam).getName() + " with " + teams.get(winningTeam).getWinCount() + " win(s)!");
			}
		}		
	}
}

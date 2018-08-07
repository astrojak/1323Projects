import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Project5_JakeWarren {

	public static void main(String[] args) {
		
		int teamNameCount = 0;						//Tracks size of the teamName array
		int teamFound = 0;
		int randomWinner;
		int i = 0;
		String winningTeam = "a";
		String[] teamName = new String [5];
		int[] winCount = new int [5];
		int[] finalWinner = new int[5];
		int finalWinnerCount = 0;
		int mostWins = 0;
		
			
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the Advanced Sportsball Tracker!");
		
		while (!winningTeam.equals("x")) {																		//Sentinel value
		
			System.out.println("Which team just won? (x to exit)");
			winningTeam = keyboard.nextLine();
		
			if (winningTeam.equals("x")) {
				System.out.println("Final Tally:");
					for(i = 0; i < teamNameCount; i++) {
					System.out.println(teamName[i] + ": " + winCount[i]);
				}
													
				for(i = 0; i < teamNameCount; i++) {
					
					if (finalWinnerCount == finalWinner.length - 1) {
						int j = 0;
						int[] tempWinner = new int [finalWinner.length * 2];				//Temp array for teamName array & where the array is increased
						for(j = 0; j < finalWinner.length; j++) {
							tempWinner[j] = finalWinner[j];
						}
						finalWinner = tempWinner;
					}
					
					if(winCount[i] > mostWins) {
						mostWins = winCount[i];
						finalWinner[0] = i;
						finalWinnerCount = 0;
					}
					else if(winCount[i] == mostWins) {
						finalWinnerCount++;
						finalWinner[finalWinnerCount] = i;
					}
				
					
				}
				randomWinner = (int)(Math.random() * finalWinnerCount);
				System.out.println("The winner is " + teamName[finalWinner[randomWinner]] + " with " + winCount[finalWinner[randomWinner]] + " win(s)!");
			}
			
			teamFound = 0;
			for(i = 0; i < teamNameCount; i++ ) {
				if (teamName[i].equals(winningTeam)) {
					winCount[i]++;
					teamFound = 1;
				}
			}
	
			if (teamFound == 0) {
				teamName[teamNameCount] = winningTeam;									//input to winningTeam placed into the array
				winCount[teamNameCount] = 1;
				teamNameCount++;
					
				
				if (teamNameCount == teamName.length) {
					String[] tempName = new String [teamName.length * 2];				//Temp array for teamName array & where the array is increased
					for(i = 0; i < teamName.length; i++) {
						tempName[i] = teamName[i];
					}
					teamName = tempName;
					
					int[] tempWin = new int [winCount.length * 2];						//Temp array for winCount array & where the array is increased
					for(i = 0; i < winCount.length; i++) {															
						tempWin[i] = winCount[i];
					}
					winCount = tempWin;
				}
			}
		}
	}
}

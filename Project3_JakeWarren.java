import java.util.Scanner;
import java.lang.Math;

public class Project3_JakeWarren {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		int i = 0;
		int j = 0;
		int mostWins = 0;
		int winningTeam;
		int[] teamNum = new int[25];
		int[] finalWinner = new int[25]; 
				
		System.out.println("Welcome to the Win Tracker! Which team won? (-1 to exit)");				//Priming read
		winningTeam = keyboard.nextInt();	
			
		while (winningTeam != -1) {																	//Sentinel value
			teamNum[winningTeam]++;			
			System.out.println("Which team won? (-1 to exit)");
			winningTeam = keyboard.nextInt();
		}																	
	
		for(i = 0; i < teamNum.length; i++) {														//Loop to find most wins 
			if (teamNum[i] > mostWins) {
				mostWins = teamNum[i];
				finalWinner[0] = i;
				j = 0;
			}
			
			else if (teamNum[i] == mostWins) {
				j++;
				finalWinner[j] = i;
			}
		}
		
		System.out.print("There are " + (j + 1) + " teams with this number of wins: ");							
		
		for(i = 0; i <= j; i++) {	
			System.out.print(finalWinner[i] + " ");													//Loop to find teams that tied
		}
		
		
		System.out.print("\n");																		//Newline employed for better readability
		System.out.println("The most number of wins is: " + mostWins);
		System.out.println("The winning team is: " + finalWinner[(int)(Math.random() * j)]);
		}
}
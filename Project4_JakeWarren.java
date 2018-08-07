import java.util.Scanner;

public class Project4_JakeWarren {

	public static void main(String[] args) {

		String answer;
				
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the Cat Age Estimator!");
		System.out.println("Does the cat have all of their adult teeth? (Y/N)");
				
		answer = keyboard.nextLine();
		
		System.out.println(" ");
		
		if (answer.equals("y")) {																				//This is the Cat Aging section
			
			int teethOne = 0;
			int teethTwo = 0;
			int eyes = 0;
			int teethColor = 0;
			int teethCondition = 0;
			int catEyes = 0;
			String moreCats = "y";
			
			while (moreCats.equals("y")) {
			
			System.out.println("Which best describes the cat's teeth?");										//Teeth color		
			System.out.println("0) White and clean");											
			System.out.println("1) Some slightly yellow areas");
			System.out.println("2) Distinctly yellow areas");
			System.out.println("3) All teeth are yellow");
			
			teethOne = keyboard.nextInt();
			
			if (teethOne == 0) {
				teethColor = 1;
			}
			else if (teethOne == 1) {
				teethColor = 2;
			}
			else if (teethOne == 2) {
				teethColor = 5;
			}
			else if (teethOne == 3) {
				teethColor = 10;
			}
			System.out.println("Estimated age based on teeth color: " + teethColor + " years");
			System.out.println(" ");
			System.out.println("Which best describes the cat's teeth?");										//Teeth condition
			System.out.println("0) No wear and tear");
			System.out.println("1) Some wear and tear");
			System.out.println("2) Some teeth are missing or broken");
			
			teethTwo = keyboard.nextInt();
			
			if (teethTwo == 0) {
				teethCondition = 1;
			}
			else if (teethTwo == 1) {
				teethCondition = 5;
			}
			else if (teethTwo == 2) {
				teethCondition = 10;
			}
			System.out.println("Estimated age based on teeth condition: " + teethCondition + "years");
			System.out.println(" ");
			System.out.println("Which best describes the cat's eyes?");											//Eye cloudiness
			System.out.println("0) Clear");
			System.out.println("1) Cloudy when viewed with an ophthalmoscope");
			System.out.println("2) Visibly cloudy");
			
			eyes = keyboard.nextInt();
			
			if (eyes == 0) {
				catEyes = 1;
			}
			else if (eyes == 1) {
				catEyes = 6;
			}
			else if (eyes ==2) {
				catEyes = 10;
			}
			System.out.println("Estimated age based on eyes: " + catEyes + " years");
			System.out.println(" ");
			System.out.println("Are there other cats from the same litter? (Y/N)");								//More cats?
			
			keyboard.nextLine();													
			moreCats = keyboard.nextLine();
	
			if (moreCats.equals("n")) {																			//Ends the while loop
				System.out.println("Estimated age of the kitten(s): " + ((double)(teethColor + teethCondition + catEyes) / 3) + " years");			
				System.out.println("Thank you for using the Cat Age Estimator. Good-bye!");
			
			}
		}
		}
		
		else if (answer.equals ("n")) {																			//This is the Kitten Aging section 
			int teeth;
			int weight;
			int kittenTeeth = 0;
			String moreCats = "y";
							
			while (moreCats.equals("y")) {
			
			System.out.println("What best describes the cat's baby teeth?");									//Kitten's teeth
			System.out.println("0) No teeth visible");
			System.out.println("1) A few teeth visible");
			System.out.println("2) Pre-molars visible");
			System.out.println("3) Molars visible");
					
			teeth = keyboard.nextInt();
						
			if (teeth == 0) {
				kittenTeeth = 0;
			}
			else if (teeth == 1) {
				kittenTeeth = 2;
			}
			else if (teeth == 2) {
				kittenTeeth = 6;
			}
			else if (teeth == 3) {
				kittenTeeth = 16;
			}
			System.out.println("Estimated age based on teeth: " + kittenTeeth + " weeks");
			System.out.println(" ");
			System.out.println("What is the cat's weight?");													//Kitten weight
			
			weight = keyboard.nextInt();
			int newWeight = weight * 2;
			
			System.out.println("Estimated age based on weight: " + newWeight + " weeks");
			System.out.println(" ");
			System.out.println("Are there other cats from the same litter? (Y/N)");								//More cats?
			
			keyboard.nextLine();													
			moreCats = keyboard.nextLine();
	
			if (moreCats.equals("n")) {																			//Ends the while loop
				System.out.println("Estimated age of the kitten(s): " + ((double)(kittenTeeth + newWeight) / 2) + " weeks");			
				System.out.println("Thank you for using the Cat Age Estimator. Good-bye!");
			}
			}
		}						
	}
}

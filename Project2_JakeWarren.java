import java.util.Scanner;

public class Project2_JakeWarren 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		int wholePounds;
		int userSex;
		double hoursDrinking;
		double alcoholConsumed;
		double finalAnswer;
		
		System.out.println("Welcome to the EBAC Calculator!");
		System.out.println("Which type of alcohol units would you like to use?");
		System.out.println("1) Standard Drink Units");
		System.out.println("2) Ounces of Alcohol");
		
		choice = keyboard.nextInt();																//Get user input for STANDARD DRINKS
		if (choice == 1) 
		{	
			System.out.println("What is your weight in whole pounds?");
			wholePounds = keyboard.nextInt();
			
			System.out.println("Which metabolic constants do you want to use?");
			System.out.println("1) Male");
			System.out.println("2) Female");
			userSex = keyboard.nextInt();	
			
			double bodyWaterConstant = 0;
			double metaRate = 0;
			
			if (userSex == 1)
			{																						//Constant type values for male
				bodyWaterConstant = 0.58;
				metaRate = 0.015;
			}
			
			else if (userSex == 2)
			{																						//Constant type values for female
				bodyWaterConstant = 0.49;
				metaRate = 0.017;
			}
		
			System.out.println("How much alcohol have you consumed?");
			alcoholConsumed = keyboard.nextDouble();
			
			System.out.println("How long have you been drinking (in hours)?");
			hoursDrinking = keyboard.nextDouble();
			
			System.out.println("Your estimated EBAC is " + ((0.806 * alcoholConsumed * 1.2) / (bodyWaterConstant * wholePounds * 0.453592) - (metaRate * hoursDrinking)) + "%");
			finalAnswer = ((0.806 * alcoholConsumed * 1.2) / (bodyWaterConstant * wholePounds * 0.453592) - (metaRate * hoursDrinking));
		
			if (finalAnswer == 0) {
				System.out.print("You are completely sober.");
			}
			else if (finalAnswer <= 0.04) {
				System.out.print("By Oklahoma law, you are within the legal limits to drive as long as you are over 21.");
			}
			else if (finalAnswer <= 0.05) {
				System.out.print("By Oklahoma law, you would be charged with a DUI if you hold a commercial license.");
			}
			else if (finalAnswer < 0.08) {
				System.out.print("By Oklahoma law, you would be charged with a DWI if you hold a standard drivers license (or a DUI if you hold a commercial license.");
			}
			else if (finalAnswer >= 0.08) {
				System.out.print("By Oklahoma law, you would be charged with a DUI.");
			}
		}
				 	
		else if (choice == 2) 
		{																		//Get user input for OUNCES OF ALCOHOL
			System.out.println("What is your weight in whole pounds?");
			wholePounds = keyboard.nextInt();
			
			System.out.println("Which metabolic constants do you want to use?");
			System.out.println("1) Male");
			System.out.println("2) Female");
			userSex = keyboard.nextInt();	
			
			double alcDistRatio = 0;																//Come back and handle this bit
			double metaRate = 0;
			
			if (userSex == 1) {																		//Constant type values for male
				alcDistRatio = 0.73;
				metaRate = 0.015;
			}
			
			else if (userSex == 2) {																//Constant type values for female
				alcDistRatio = 0.66;
				metaRate = 0.017;
			}
							
			System.out.println("How much alcohol have you consumed?");
			alcoholConsumed = keyboard.nextDouble();
			
			System.out.println("How long have you been drinking (in hours)?");
			hoursDrinking = keyboard.nextDouble();
			
			System.out.println("Your estimated EBAC is " + ((alcoholConsumed * 5.4) / (alcDistRatio * wholePounds) - (metaRate * hoursDrinking)) + "%");
			finalAnswer = ((alcoholConsumed * 5.4) / (alcDistRatio * wholePounds) - (metaRate * hoursDrinking));
			
			if (finalAnswer == 0) {
				System.out.print("You are completely sober.");
			}
			else if (finalAnswer <= 0.04) {
				System.out.print("By Oklahoma law, you are within the legal limits to drive as long as you are over 21.");
			}
			else if (finalAnswer <= 0.05) {
				System.out.print("By Oklahoma law, you would be charged with a DUI if you hold a commercial license.");
			}
			else if (finalAnswer < 0.08) {
				System.out.print("By Oklahoma law, you would be charged with a DWI if you hold a standard drivers license (or a DUI if you hold a commercial license.");
			}
			else if (finalAnswer >= 0.08) {
				System.out.print("By Oklahoma law, you would be charged with a DUI.");
			}
		}
	} 
}

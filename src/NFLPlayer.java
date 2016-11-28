import java. util.Scanner;

public class NFLPlayer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Player list and statistics
		 * 
		 * Stats of players are preset here and are as is */
		
		// Player 1
		// Personal statistics
		String  Trevor_Siemian = "Trevor Siemian"; // Player Name	
		
		int heightInches = 3; // Height in inches
		int heightFeet = 6; // Height in feet
		int age = 24; // Age in years
		double weight = 220.0; // Weight in pounds
		int birthDay = 26; // Day of birth
		int birthMonth = 12; // Month of birth
		int birthYear = 1991; // Year of birth
		String birthPlace = "Windermere, FL"; // PLace of birth (city and state)
		String highschool = "Olympia HS [Orlando, FL]"; // High school player graduated from 
		String college = "Northwestern"; // College attended
		String gender = "he"; // PLayers gender (for sentence structure)
		
		// Game statistics
		String team = "Broncos"; // Player Team
		String teamCity = "Denver"; // City of Team
		String position = "Quarterback"; // PLayer Position
		int jerseyNumber = 13; // Number on PLayer's jersey
		int experience = 2; // Seasons completed
		
		int touchdowns = 12; // Touchdowns this season
		int interceptions = 7; // Interceptions thrown this season
		double passingYards = 2028.0; // Seasonal passing yards
		double rating = 85.0; // PLayer's overall rating (according to NFL official website)
		
		// Display information on player
		System.out.print("Press ( 1 ) for statistics of player 1: ");
			int playerChoice = input.nextInt(); // asks user to show stats for player of choice
			
			if (playerChoice == 1) {
				System.out.println("You have chosen " + Trevor_Siemian + " from the " + teamCity + " " +
				team + ". ");
				System.out.println(Trevor_Siemian + " is " + heightFeet + " feet, " + heightInches + " inches, weighing "
				+ weight + " pounds.");
				System.out.println(gender + " is " + age + " years old, born on " + birthMonth + "/" +
				birthDay + "/" + birthYear + " in " + birthPlace + ", graduating from " + highschool);
				System.out.println("and later" + " attended " + college + " College.");
				System.out.println("____________________________________________________");
				System.out.println("NFL Stats:");
				System.out.println(position + " " + Trevor_Siemian + ", number " + jerseyNumber + ", has thrown " +
				touchdowns + " touchdowns, and " + interceptions + " interceptions with a total of " + 
				passingYards + " passing yards.");
				System.out.println("These stats determine " + Trevor_Siemian + "'s has a total rating of: " +
				rating);
			}
			else {
				System.out.println("Invalid Input!");
				System.exit(1);
		}
	}
}
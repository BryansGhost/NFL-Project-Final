
public class NFLPlayer {

	// Personal statistics
	private int heightInches;
	private int heightFeet;
	private int age;
	private double weight;
	
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	
	private String birthPlace;
	private String highschool;
	private String college;
	
	// Gameplay statistics
	private String team;
	private String teamCity;
	private String position;
	private int jerseyNumber;
	private int experience;
	
	private int touchdowns;
	private int interceptions;
	private int passingAttempts;
	private int completedPasses;
	private int passingYards;
	private int runningYards;
	private int recievingYards;
	private int tackles;
	private int sacks;
	
	
	// Method for Quarterback rating
	public double QBRating(int touchdowns, int passingAttempts, int completedPasses,
			int passingYards, int interceptions) {
		
		 	double a = (completedPasses / passingAttempts - 0.3) * 5;
		 	double b = (passingYards / passingAttempts - 3) * 0.25;
		 	double c = (touchdowns / passingAttempts) * 25;
		 	double d = 2.375 - (interceptions / passingAttempts * 25);
		 	double ratingQB = ((a + b + c + d) / 6) * 100;
		 	{
			return ratingQB;
			}	
		 	
	}
			
	
	

}

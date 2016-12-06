
class MyTest {
	public static void main(String[] args) {
		
		NFLPlayer playerStats = new NFLPlayer();
		
		//Player1 finding quarterback rating
		int touchdowns = 30;
		int passingAttempts = 500;
		int passingYards = 3913;
		int interceptions = 11;
		int completedPasses = 357;
		
		// Call QB rating method
		playerStats.QBRating(touchdowns, passingAttempts, completedPasses,
				passingYards, interceptions); 
	
		System.out.println(playerStats.QBRating(touchdowns, passingAttempts,
				completedPasses, passingYards, interceptions));
	}

}

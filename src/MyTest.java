
class MyTest {
	public static void main(String[] args) {
		
		NFLPlayer playerStats = new NFLPlayer();
		
		//Player1 finding quarterback rating
		int touchdowns = 2;
		int passingAttempts = 44;
		int passingYards = 285;
		int interceptions = 1;
		int completedPasses = 35;
		
		// Call QB rating method
		playerStats.QBRating(touchdowns, passingAttempts, completedPasses,
				passingYards, interceptions); 
	
		System.out.println(QBRating);
	}

}

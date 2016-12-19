public class NFLPlayer extends PlayerManager {
	
	private PlayerManager[] player;	
	
	// Characteristics
	public int heightInches;
	public int heightFeet;
	public int age;
	public double weight;
	
	// Personal statistics
	public int birthDay;
	public int birthMonth;
	public int birthYear;
	public String birthPlace;
	public String highschool;
	public String college;
	
	// General game play statistics
	public String team;
	public String teamCity;
	public String position;
	public int jerseyNumber;
	public int experience;
	
	// Call to celebration method
	boolean drafted;
	public static String ifDrafted(drafted == true) {
		Celebration.celebrate();
		return;
	}
	
	
	public static void CreatePlayers(String myPlayers[]) {
		String[] myPlayers = new String[6]; 
		myPlayers[0] = "Drew Brees"; //Quarter back
		myPlayers[1] = "Ezekiel Elliot"; //Running back
		myPlayers[2] = "Antonio Brown"; //Wide Receiver
		myPlayers[3] = "Damon Harisson"; //Defensive Lineman
		myPlayers[4] = "Landon Collins"; // Defensive Back
		myPlayers[5] = "Dontae Johnson"; //Punt returner
		}
	}

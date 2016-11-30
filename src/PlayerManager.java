import java.util.Scanner;

public class PlayerManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Player array
		String[] player = new String[6]; // Initialize players for elements in array
		player[0] = "(1) Trevor Seimian \n";
		player[1] = "(2) Drew Brees \n";
		player[2] = "(3) Kurt Cousins \n";
		player[3] = "(4) Matt Ryan \n";
		player[4] = "(5) Phillip Rivers \n";
		player[5] = "(6) Derek Carr \n";
		
		//Display players
		System.out.println("Players:\n");
		createPlayers(player);
		}
		public static void createPlayers(String[] playerChoice) {
			
			for (String p : playerChoice){
				System.out.printf(p);
			}
		
	}
}
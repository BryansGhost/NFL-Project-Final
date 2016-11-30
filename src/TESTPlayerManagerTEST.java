//DO NOT USE

import java.util.Scanner;

public class PlayerManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Player array
		String[] player = new String[6];
		
		// Initialize elements for player Array
		player[0] = "(1) Trevor Seimian";
		player[1] = "(2) Drew Brees";
		player[2] = "(3) Kurt Cousins";
		player[3] = "(4) Matt Ryan";
		player[4] = "(5) Phillip Rivers";
		player[5] = "(6) Derek Carr";
		
		// Display players in list
		System.out.println("Choose player:\n\n" + player[0] + "\n" + player[1] + "\n" +
				player[2] + "\n" + player[3] + "\n" + player[4] + "\n" + player[5]);
		int playerSelect = input.nextInt();
		
		System.out.println("Chosen player: " + playerSelect);
	}
		// Add method for creating players
		public int CreatePlayers(int p1, int p2, int p3, int p4, int p5, int p6) {
			
			return p; /////this is aaaaallll wrong
			
			
			/*** do not use this!!!!!!*///
			
	}

}

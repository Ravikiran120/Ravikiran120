package kingdom_game;

import java.util.Scanner;

public class QueenGuess {
	void printWon() {
				
		Score scr = Score.getInstance();;
		scr.createScore();
		
		System.out.println("Found the queen /n Ready for next level?");
		
		Scanner s =new Scanner(System.in);
		 
		 String input =s.next(); 
		 if(input.equalsIgnoreCase("yes")) {	 
			 Setup su = new Setup();
			 su.continueGame(1);
		 }else {
			 Exit ex = new Exit();
			 ex.createExit();
		 }
			
	}

}

package kingdom_game;
import java.util.Scanner;

public class Setup {
	
	void createSetup() {
		System.out.println("Welcome to Menu");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("\n1.Start Game\n2.Score\n3.Exit");
		System.out.println("\nEnter your choice");
		int choice=sc.nextInt();
		continueGame(choice);
	}
	void continueGame(int choice) {
		switch(choice) {
		
		case 1:
			System.out.println("\nCreating ROOM");
			
			Level lv= Level.getInstance();
			System.out.println("\n***LEVEL "+lv.createLevel()+"***\n");
			
			int mat_size = lv.getMat_size();
			int total_length = mat_size * mat_size;
			
			MatrixCreator m = new MatrixCreator();
			int[][] current_mat = m.createMatrix(mat_size);
			
			QueenRandomGenerator qr = new QueenRandomGenerator();
			int queenPosition = qr.queenGen(total_length);
			System.out.println("Queen in "+ queenPosition );
			
			BombRandomGenerator brg = new BombRandomGenerator();
			int bombPosition = brg.bombGen(total_length, queenPosition);
			System.out.println("Bomb in "+ bombPosition +"\n");
			
			ArrayPrinter ap = new ArrayPrinter();
			ap.displayArray(current_mat, mat_size);
			
			UserInput u = new UserInput();
			QueenGuess qg = new QueenGuess();
			BombGuess bg = new BombGuess();
			MissGuess mg = new MissGuess();
			
			boolean end_for_sure = false;
			
			do {
				System.out.println("\nGuess the number to check");
				int guessedNum = u.getUserInput(mat_size);

				if (guessedNum == queenPosition) {
					qg.printWon();
					end_for_sure = true;
				} else if (guessedNum == bombPosition) {
					bg.printLost();
				} else {
					mg.wrongguess(guessedNum,mat_size);
				}
			} while (end_for_sure == false);
			
						
			break;
			
		case 2:
			System.out.println("\nDisplaying Score....");
			Score scr = new Score();
			scr.printScore();
			break;
			
		case 3:
			System.out.println("\nExiting the game....");
			Exit ex = new Exit();
			ex.createExit();
			break;
		
		}
		
	}

}

package kingdom_game;

public class Score {
	int score = 0;
	private static Score sg_instance = null;
	
	public static Score getInstance() {
		if(sg_instance == null)
			sg_instance = new Score();
		return sg_instance;
	}
	
	void createScore() {
		
		score =score+50;
		System.out.println("Your Score is\t"+score);
	}
	void printScore() {
		System.out.println("Your Score is\t"+score);
	}

}

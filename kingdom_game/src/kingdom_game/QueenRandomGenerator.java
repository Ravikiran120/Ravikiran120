package kingdom_game;

import java.util.Random;

public class QueenRandomGenerator {
	static int queen_position;
	public static int queenGen(int total_length) {
		Random rand = new Random();
		queen_position = rand.nextInt(total_length)+1;
		return queen_position;
	}
	public static int getQueenPos() {
		return queen_position;
	}

}

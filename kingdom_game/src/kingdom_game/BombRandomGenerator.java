package kingdom_game;

import java.util.Random;

public class BombRandomGenerator {
	public int bombGen(int total_length, int queen_position) {
		Random rand = new Random();
		int bomb_position = rand.nextInt(total_length)+1;
		while(bomb_position == queen_position) {
			bomb_position = rand.nextInt(total_length)+1;
		}
		return bomb_position;
	}

}

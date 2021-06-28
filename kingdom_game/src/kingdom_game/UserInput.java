package kingdom_game;

import java.util.Scanner;

public class UserInput {
	public int getUserInput(int mat_size) {
		Scanner sc = new Scanner(System.in);
		int user_input = sc.nextInt();

		while (user_input == 0 || (user_input > (mat_size * mat_size))) {
			System.out.println("\nEnter a valid input:");
			user_input = sc.nextInt();
		}
		return user_input;
	}

}

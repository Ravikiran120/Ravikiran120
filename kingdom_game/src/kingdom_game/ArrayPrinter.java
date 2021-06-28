package kingdom_game;

public class ArrayPrinter {

	public void displayArray(int[][] array, int mat_size) {
		for (int i = 0; i < mat_size; i++) {
			for (int j = 0; j < mat_size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}

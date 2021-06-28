package kingdom_game;

public class MatrixCreator {


	public int[][] createMatrix(int mat_size) {
		int[][] array = new int[mat_size][mat_size];
		
		int num=1;
		for(int i=0;i<mat_size;i++) {
			for(int j=0;j<mat_size;j++) {
				array[i][j] = num;
				num++;
			}
		}
		return array;
	}
}


//contains....... includes...........
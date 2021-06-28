package kingdom_game;

class Level{
	private int mat_size =3;
	private int level;
	private static Level single_instance = null;
	
	
	public int getMat_size() {
		return mat_size;
	}
	public void setMat_size(int mat_size) {
		this.mat_size = mat_size;
	}
	public static Level getInstance() {
		if(single_instance == null)
			single_instance = new Level();
		return single_instance;
	}
	
	int createLevel() {
		
		int temp = getLevel()+1;
		setLevel(temp);
		return getLevel();
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}

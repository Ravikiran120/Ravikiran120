package kingdom_game;

public class Kingdom {
	public static void main(String []args) {
		
		System.out.println("\n\t\t\tKINGDOM GAME\t\t\t\t\n");
		
		Story sty = new Story();
		sty.baseStory();
		
		Setup set = new Setup();
		set.createSetup();
		
	}

}

package kingdom_game;

public class MissGuess {
	public void wrongguess(int guessedNum,int mat_size) {
		System.out.println("You made a wrong guess ");
		System.out.println("The clue for you is ");
		int queen_position = QueenRandomGenerator.getQueenPos();
		 int n1 = guessedNum;
		 int q1 = (queen_position%mat_size);
			
			while((n1%mat_size)!=0) {
				n1 =n1+1;
			}
			
			if(queen_position==guessedNum) {
				System.out.println("Found the queen /n Ready for next level?");
			}
			else if((queen_position<=n1) && (queen_position>(n1-mat_size))) {
				System.out.println("Same");
				if((q1<=(Math.floorDiv(mat_size,2))) && (q1!=0)) {
						System.out.println("Left");
			    }
			    else if (q1 == ((Math.floorDiv(mat_size,2))+1)) {
			    		System.out.println("Middle");
		        }
		        else {
		        	System.out.println("Right");
		        }
			}

		    else if (queen_position<guessedNum) {
		    	System.out.println("Top");
		    	if(q1<=(Math.floorDiv(mat_size,2)) && (q1!=0)) {
		    			System.out.println("Left");
		        }
		        else if (q1 == ((Math.floorDiv(mat_size,2))+1)) {
		        		System.out.println("Middle");
		        }
		        else {
		        	System.out.println("Right");
		        }
		    }
		    
		    else {
		    	System.out.println("Bottom");
		    	if (q1<=(Math.floorDiv(mat_size,2)) && (q1!=0)) {
		    			System.out.println("Left");
		        }
		        else if(q1==((Math.floorDiv(mat_size,2))+1)) {
		        		System.out.println("Mid");
		        }
		        else {
		        	System.out.println("Right");
		        }
		     } 	
	}

}
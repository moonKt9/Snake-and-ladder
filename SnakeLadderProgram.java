//Snake and Ladder Simulator- This problem stimulates a snake ladder game.
//the player starts from zero rolls the die to get number between 1 to 6,finds a safe place ,
//ladder or snake keeps doing till the winning spot 100 is achieved.

public class SnakeLadderProgram {

		
		static int playerPosition=0; // snake and ladder game played with single player at start position 
		
		static final int NO_PLAY=1;
		
		static final int Ladder=2;
		
		static final int Snake=3;
		
		static final int WIN_POSITION=100;
		
			
			private static int dieRoll() {
			int dieValue=(int)(Math.random()*10 %6)+1;
			return dieValue;
			}
					
			private static int getOption() {
			int option =(int)(Math.random()*10%3)+1;
			return option;
			}
			
			private static void playGame(int option,int dieValue) {
				
				switch(option) {
				
				case NO_PLAY:
				System.out.println("No Play");
				break;
				
				case Ladder:
					playerPosition=playerPosition + dieValue;
					break;
					
				case Snake:
					playerPosition=playerPosition-dieValue;
					break;
					
					default:
						
				}
			}

				public static void main(String args[]) {
					
					while(playerPosition<=WIN_POSITION) {
						
					
						int dieValue=dieRoll();
						System.out.println("Die:" + dieValue);
						
						int option =getOption();
						System.out.println("Option" + option);
						playGame(option,dieValue);
						
					}
					
					
					
				}
}
					
					
				
				
		
			
			
		
		
	


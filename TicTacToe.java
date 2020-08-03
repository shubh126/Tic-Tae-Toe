import java.util.Random;

public class TicTacToe {
	
	private final int NO_OF_ROWS = 3;
	private final int NO_OF_COLUMNS = 3;
	private final int BOARD_SIZE = NO_OF_ROWS * NO_OF_COLUMNS;
	private final int INOTIAL_POSITION = 0;
	int dieNum;
	
	int board [] = new int [BOARD_SIZE];
	
	public void resetBoard() {
		
		for (int currentPosition = 1;currentPosition <= BOARD_SIZE;currentPosition++) {
			board [currentPosition] = 0;
		}
	}
	
	public void toss() {
		Random rand=new Random();
	    dieNum = rand.nextInt(2) + 1;
	    if (dieNum == 1) {
	    	String firstPerson = "First Person";
	    	System.out.println(firstPerson+" has won the Toss");
	    }
	    else {
	    	String secondPerson = "Second Person";
	    	System.out.println(secondPerson+" has won the Toss");
	    }
	}
	
	public static void main(String[] args) {
		TicTacToe a = new TicTacToe ();
		a.toss();
	}

}

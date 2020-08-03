import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
	
	private final int NO_OF_ROWS = 3;
	private final int NO_OF_COLUMNS = 3;
	private final int BOARD_SIZE = NO_OF_ROWS * NO_OF_COLUMNS;
	private final int INOTIAL_POSITION = 0;
	
	int board [] = new int [BOARD_SIZE];
	
	public void resetBoard() {
		
		for (int currentPosition = 1;currentPosition <= BOARD_SIZE;currentPosition++) {
			board [currentPosition] = 0;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

package csc110_monopoly;

public class Board {
	private final int boardSize = 40;
	private int [] board = new int [boardSize];
	
	
	public int[] getBoard() {
		return board;
	}
	public void setBoard(int[] board) {
		this.board = board;
	}
	
	private void initializeBoard() {
		//fill the spots of the array with the values from the enum
		
	}
}

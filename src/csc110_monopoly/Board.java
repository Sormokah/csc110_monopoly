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
	public void printBoard() {
		System.out.println(" ______________________________________________________" + '\n'
						 + "|GO $|MEDT|{$$}|BALT|ITAX|READ|ORIE|[??]|VERM|CONN|JAIL|" + '\n'
						 + "|____|____|____|____|____|____|____|____|____|____|____|" + '\n'
						 + "|BWLK|                                            |ST.C|" + '\n'
						 + "|____| [Chance]                                   |____|" + '\n'
						 + "|LTAX|                                            |pwr |" + '\n'
						 + "|____|                                            |____|" + '\n'
						 + "|PARK|                                            |STAT|" + '\n'
						 + "|____|                                            |____|" + '\n'
						 + "|[??]|                                            |VIRG|" + '\n'
						 + "|____|                Monopoly                    |____|" + '\n'
						 + "|SHRT|           JAVA Console Edition             |PENR|" + '\n'
						 + "|____|                                            |____|" + '\n'
						 + "|PN-A|                                            |ST.J|" + '\n'
						 + "|____|                                            |____|" + '\n'
						 + "|{$$}|                                            |{$$}|" + '\n'
						 + "|____|                                            |____|" + '\n'
						 + "|N-CA|                                            |TENN|" + '\n'
						 + "|____|                                            |____|" + '\n'
						 + "|PACI|                                    [Chest] |NY-A|" + '\n'
						 + "|____|____________________________________________|____|" + '\n'
						 + "|GTJ>|MRVN|wtr |VENT|ATLA|B&O |ILLI|INDI|[??]|KENT|FREE|" + '\n'
						 + "|____|____|____|____|____|____|____|____|____|____|____|" );
	}
}

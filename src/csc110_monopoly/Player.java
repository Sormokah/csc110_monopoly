package csc110_monopoly;

public class Player {
	private Pieces piece;

	private final int BOARD_LENGTH = 40;
	
	private int money;

	private int roll;

	private int location;

	private boolean aroundOnce;

	private int doubleCount;
	
	private int die1;
	
	private int die2;
	
	private boolean inJail;
	
	private int turnsInJail;
	
	
	
	public void movePlayer(int distance)
	{
		if((this.location + distance) > 39)
		{
			this.location = (location + distance - BOARD_LENGTH);
		}
		else
		{
			location += distance;
		}
	}
	
	public Pieces getPiece() {
		return this.piece;
	}

	public void setPiece(Pieces piece) {
		this.piece = piece;
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getRoll() {
		return this.roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getLocation() {
		return this.roll;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public boolean isAroundOnce() {
		return aroundOnce;
	}

	public void setAroundOnce(boolean aroundOnce) {
		this.aroundOnce = aroundOnce;
	}

	public int getDoubleCount() {
		return doubleCount;
	}

	public void setDoubleCount(int doubleCount) {
		this.doubleCount = doubleCount;
	}

	public int getDie1() {
		return die1;
	}

	public void setDie1(int die1) {
		this.die1 = die1;
	}

	public int getDie2() {
		return die2;
	}

	public void setDie2(int die2) {
		this.die2 = die2;
	}

	public boolean isInJail() {
		return inJail;
	}

	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}

	public int getTurnsInJail() {
		return turnsInJail;
	}

	public void setTurnsInJail(int turnsInJail) {
		this.turnsInJail = turnsInJail;
	}
	
	

}

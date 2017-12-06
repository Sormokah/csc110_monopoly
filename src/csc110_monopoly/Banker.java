package csc110_monopoly;

public class Banker {
	private int housesLeft = 32;
	private int hotelsLeft = 12;

	// boolean hasProperty()

	// loans

	// pay dem hoes(int ammount)
	public void pay(int amount, Player activePlayer) {
		activePlayer.setMoney(activePlayer.getMoney() + amount);
	}

	public void payBank(int amount, Player activePlayer) {
		activePlayer.setMoney(activePlayer.getMoney() - amount);
	}

	public int getHousesLeft() {
		return housesLeft;
	}

	public void setHousesLeft(int housesLeft) {
		this.housesLeft = housesLeft;
	}

	public int getHotelsLeft() {
		return hotelsLeft;
	}

	public void setHotelsLeft(int hotelsLeft) {
		this.hotelsLeft = hotelsLeft;
	}
}

package csc110_monopoly;

public class Banker {
	// haza(lotta) money
	// haza house
	public void availableHouses() {

	}

	// haza hotels
	public void availableHotels() {
	
	}

	// boolean hasProperty()

	// loans

	// pay dem hoes(int ammount)
	public void pay(int amount, Player activePlayer) {
		activePlayer.setMoney(activePlayer.getMoney() + amount);
	}
	public void payBank(int amount , Player activePlayer) {
		activePlayer.setMoney(activePlayer.getMoney() - amount);
	}
}

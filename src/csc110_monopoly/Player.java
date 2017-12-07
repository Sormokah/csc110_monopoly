package csc110_monopoly;

import java.util.ArrayList;

public class Player {
	private ArrayList<Property> properties = new ArrayList<>();
	
	private int utilitiesOwned = 0;
	
	private int railroadsOwned = 0;
	
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
	
	private boolean hasGetOutOfJailFreeChest;
	
	private int houses = 0;
	
	private int hotels = 0;

	private boolean hasGetOutOfJailFreeChance;
	
	public void newProperty(Property name)
	{
		properties.add(name);
	}
	
	public void adjustHousesAndHotels()
	{
		for(Property p: properties)
		{
			this.houses += p.getHousesOnProperty();
			if(p.isHasHotel())
			{
				this.hotels++;
			}
		}
		
	}
	
	public void movePlayer()
	{
		if((this.location + this.roll) > 39)
		{
			this.location = (location + this.roll - BOARD_LENGTH);
			this.aroundOnce = true;
		}
		else
		{
			this.location = this.location + this.roll;
		}
	}
	
	public int getUtilitiesOwned() {
		return utilitiesOwned;
	}

	public void setUtilitiesOwned(int utilitiesOwned) {
		this.utilitiesOwned = utilitiesOwned;
	}

	public int getRailroadsOwned() {
		return railroadsOwned;
	}

	public void setRailroadsOwned(int railroadsOwned) {
		this.railroadsOwned = railroadsOwned;
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
		return this.location;
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
	public boolean isHasGetOutOfJailFreeChest() {
		return hasGetOutOfJailFreeChest;
	}

	public void setHasGetOutOfJailFreeChest(boolean hasGetOutOfJailFreeChest) {
		this.hasGetOutOfJailFreeChest = hasGetOutOfJailFreeChest;
	}

	public boolean isHasGetOutOfJailFreeChance() {
		return hasGetOutOfJailFreeChance;
	}

	public void setHasGetOutOfJailFreeChance(boolean hasGetOutOfJailFreeChance) {
		this.hasGetOutOfJailFreeChance = hasGetOutOfJailFreeChance;
	}

	public int getHouses() {
		return houses;
	}

	public void setHouses(int houses) {
		this.houses = houses;
	}

	public int getHotels() {
		return hotels;
	}

	public void setHotels(int hotels) {
		this.hotels = hotels;
	}
	

}

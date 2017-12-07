package csc110_monopoly;

import java.io.IOException;
import java.util.ArrayList;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class Game {

	public Dice die = new Dice();
	
	private boolean speed;
	private boolean gameOver;
	public boolean getSpeed() {
		return this.speed;
	}

	private ArrayList<Player> players = new ArrayList<>();
	private Player activePlayer;
	public Player getActivePlayer()
	{
		return activePlayer;
	}
	private int activePlayerIndex;

	public void initializeGame() throws IOException {

		speed = determineSpeedDie();
		int ammountOfPlayers = getNumberOfPlayers();
		createPlayers(ammountOfPlayers);
		for (Player p : players) {
			establishPlayerPiece(p);
		}
		for (Player p : players) {
			if (speed) {
				p.setMoney(2500);
			} else {
				p.setMoney(1500);
			}
		}
		determineFirstPlayer();

		playGame();

	}

	private void playGame() throws IOException {
		while(!gameOver)
		{
			takeTurn();
			nextPlayer();
		}
	}

	private void nextPlayer() throws IOException {
		if(activePlayerIndex != players.size()-1)
		{
		 activePlayer = players.get(activePlayerIndex + 1);
		 activePlayerIndex = activePlayerIndex +1;
		}
		else
		{
			activePlayer = players.get(0);
			activePlayerIndex = 0;
		}
		
	}

	private void takeTurn() throws IOException {
		//if not in jail roll 2d6  {KISS DRY}
		//if doubles reroll
		//if doubles 3 times go to jail.
		//if jail , jail menu
		if(!activePlayer.isInJail()) {
		
		int doubleCount = 0;
		while(doubleCount < 3) {
		die.roll(activePlayer);
		if(checkForDoubles()) {
			doubleCount++;
		}
		if(doubleCount != 3)
		{
		movePlayer();
		interperateCurrentSpace(); //fill out this method
		}
		if(!checkForDoubles()) {
			break;
		}
		if(doubleCount == 3) {
			System.out.println("You rolled a third set of doubles! You're going to jail!");
			activePlayer.setLocation(10);
			activePlayer.setInJail(true);
		}
		}
		}
		else {
			jailMenu();
		}
	}
		
		public ArrayList<Player> getPlayers() {
		return players;
	}

		private void movePlayer() {
		
		activePlayer.movePlayer();
		System.out.println("Player " + activePlayer.getPiece() + ", you rolled " + activePlayer.getDie1() + " and " + activePlayer.getDie2() + " for a total of " + (activePlayer.getDie1() + activePlayer.getDie2()) + " spaces.");
		System.out.println("You are now on space " + activePlayer.getLocation() + ".\n");
		
	}

	

	private void jailMenu() throws IOException {
//		String[] jailMenuChoicesWithGetOut = {"Roll", "Use Get out of jail free card", "Buy houses/hotels", "Pay to get out"};
//		String[] jailMenuC
//		switch(ConsoleUI.promptForMenuSelection(jailMenuChoices, false))
//		{
//		case 1:
//			rollToGetOut();
//			break;
//		case 2:
//			useGetOutOfJail();
//			break;
//		case 3:
//			break;
//		case 4:
//			break;
//		}
	}

	private boolean checkForDoubles() throws IOException {
		if(activePlayer.getDie1() == activePlayer.getDie2())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private void interperateCurrentSpace() {
		
		for(Properties p: Properties.values())
		{
			
		}
		
		
	}

	private void determineFirstPlayer() {
		ArrayList<Integer> playerRolls = new ArrayList<>();
		do {
			for (Player p : players) {
				Dice die = new Dice();
				p.setRoll(die.rollD6() + die.rollD6());
				playerRolls.add(die.rollD6() + die.rollD6());
			}
		} while (!validRoll(playerRolls));

		int highestRoll = 0;
		for (Player p : players) {
			if (p.getRoll() > highestRoll) {
				highestRoll = p.getRoll();
				activePlayer = p;
				activePlayerIndex = players.indexOf(p);
			}
		}
		System.out.println(activePlayer.getPiece() + ", you are going first with a roll of: " + highestRoll + ".");

	}

	private boolean validRoll(ArrayList<Integer> playerRolls) {

		playerRolls.sort(null);
		if (playerRolls.size() - 1 == playerRolls.size() - 2) {
			return false;
		}
		return true;
	}

	private void createPlayers(int ammountOfPlayers) {
		switch (ammountOfPlayers) {
		case 8:
			Player p8 = new Player();
			players.add(0, p8);
		case 7:
			Player p7 = new Player();
			players.add(0, p7);
		case 6:
			Player p6 = new Player();
			players.add(0, p6);
		case 5:
			Player p5 = new Player();
			players.add(0, p5);
		case 4:
			Player p4 = new Player();
			players.add(0, p4);
		case 3:
			Player p3 = new Player();
			players.add(0, p3);
		case 2:
			Player p2 = new Player();
			players.add(0, p2);
		case 1:
			Player p1 = new Player();
			players.add(0, p1);
			break;
		}
		for (Player p : players) {
			p.setLocation(0);// start at GO
		}
	}

	private void establishPlayerPiece(Player p) throws IOException {
		int choice;
		String[] menuChoices = { "Car", "Dog", "Cat", "Shoe", "Thimble", "Hat", "Wheel Barrel", "Ship" };
		System.out.println("Welcome, player " + (players.indexOf(p) + 1) + ". Which piece would you like?");
		do {
			choice = ConsoleUI.promptForMenuSelection(menuChoices, false);

			switch (choice) {
			case 1:
				p.setPiece(Pieces.Car);
				break;
			case 2:
				p.setPiece(Pieces.Dog);
				break;
			case 3:
				p.setPiece(Pieces.Cat);
				break;
			case 4:
				p.setPiece(Pieces.Shoe);
				break;
			case 5:
				p.setPiece(Pieces.Thimble);
				break;
			case 6:
				p.setPiece(Pieces.Hat);
				break;
			case 7:
				p.setPiece(Pieces.WheelBarrel);
				break;
			case 8:
				p.setPiece(Pieces.Ship);
				break;
			}
		} while (!validchoice(p));

	}

	private boolean validchoice(Player p) {
		int currentLocation = players.indexOf(p);
		for (int i = 0; i < currentLocation; i++) {
			if (players.get(i).getPiece().equals(p.getPiece())) {
				System.out.println("Please enter an unused piece.");
				return false;
			}
		}

		return true;
	}

	private int getNumberOfPlayers() throws IOException {
		return ConsoleUI.promptForInt("How many players are present?", 2, 8);

	}

	private boolean determineSpeedDie() throws IOException {

		return ConsoleUI.promptForBool("Would you like to play with the speed die? (yes/no)", "yes", "no");

	}

	public ArrayList<Player> getInactivePlayers()
	{
		ArrayList<Player> inactivePlayers = players;
		inactivePlayers.remove(activePlayer);
		//ArrayList<Player> inactivePlayers = players.remove(activePlayer);
		return inactivePlayers;
	}
}

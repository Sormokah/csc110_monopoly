package csc110_monopoly;

import java.util.ArrayList;
import java.util.Random;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Chance {
	ArrayList<Integer> cards = new ArrayList<>();
	int maxCards = 16;
	Banker bank = new Banker();
	
	public void deckChanceCards() {
		for(int i = 0; i < maxCards; i++) {
			cards.add(i);
		}
	}
	
	public void pickChance(Player activePlayer) {
	Random gen = new Random();
	int card = gen.nextInt(maxCards);
	
	if(card == 0) {
		System.out.println("Advance to Go (Collect $200)");
		//activeplayer.setLocation(0);
		bank.pay(200, activePlayer);
		cards.remove(0);
	}
	if(card == 1) {
		System.out.println("Advance to Illinois Ave. - If you pass Go, collect $200");
		//if (activePlayer.getLocation() > 24) {
		//bank.pay(200 , activePlayer);
		//}
		// activePlayer.setLocation(24);
		//if board[24] is owned pay owner.
		cards.remove(1);
	}
	if(card == 2) {
		System.out.println("Advance to St. Charles Place - If you pass Go, collect $200");
		//if (activePlayer.getLocation() > 11) {
		//bank.pay(200 , activePlayer);
		//}
		//if board[11] is owned pay owner.
		//activePlayer.setLocation(11);
		cards.remove(2);
	}
	if(card == 3) {
		System.out.println("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.");
		//if (activePlayer.getLocation() == 7) 
		//activePlayer.setLocation(12);
		//}
		//if (activePlayer.getLocation() == 36) {
		// bank.pay(200 , activePlayer);
		//activePlayer.setLocation(12);
		//}
		//if (activePlayer.getLocation() == 22) 
		//activePlayer.setLocation(28);
		//if activePlayer.getLocation() == owned pay owner 10x (2d6)
		cards.remove(3);
	}
	if(card == 4) {
		System.out.println("Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
		//if (activePlayer.getLocation() == 36) {
		//bank.pay(200 , activePlayer);
		//activePlayer.setLocation(5);
		//}
		//if (activePlayer.getLocation() == 7) {
		//activePlayer.setLocation(15);
		//}
		//if (activePlayer.getlocation() == 22)
		//activePlayer.setLocation(25);
		//pay the person if location is owned
		cards.remove(4);
	}
	if(card == 5) {
		System.out.println("Bank pays you dividend of $50");
		bank.pay(50 , activePlayer);
		cards.remove(5);
	}
	if(card == 6) {
		System.out.println("Get out of Jail Free – This card may be kept until needed, or traded/sold");
		activePlayer.setHasGetOutOfJailFreeChance(true);
		cards.remove(6);
	}
	if(card == 7) {
		System.out.println("Go Back 3 Spaces");
		//if (activePlayer.getLocation() == 7) 
		//activePlayer.setLocation(4); && IncomeTax();
		//}
		//if (activePlayer.getLocation() == 22) 
		//activePlayer.setLocation(19) 
		//if board[19] == owned pay rent to owner.
		//}
		//if (activePlayer.getLocation() == 36) 
		//activePlayer.setLocation(33); 
		//Community.pickChest();
		cards.remove(7);
	}
	if(card == 8) {
		System.out.println("Go to Jail – Go directly to Jail – Do not pass Go, do not collect $200");
		//activePlayer.setLocation(10);
		//activePlayer.isInJail = true;
		cards.remove(8);
	}
	if(card == 9) {
		System.out.println("Make general repairs on all your property – For each house pay $25 – For each hotel $100");
		//for loop, count houses times($25) payBank(amount);
		//for loop, count hotels times($100) payBank(amount);
		cards.remove(9);
	}
	if(card == 10) {
		System.out.println("Pay poor tax of $15");
		bank.payBank(15 , activePlayer);
		cards.remove(10);
	}
	if(card == 11) {
		System.out.println("Take a trip to Reading Railroad – If you pass Go, collect $200");
		//if (activePlayer.getLocation() > 5) 
		//bank.pay(200 , activePlayer);
		//activePlayer.setLocation(5);
		//}
		//if (activePlayer.getLocation() < 5) 
		//player.setLocation(5);
		//}
		cards.remove(11);
	}
	if(card == 12) {
		System.out.println("Take a walk on the Boardwalk – Advance token to Boardwalk");
		//activePlayer.setLocation(39); 
		//if board[39] is owned pay owner.
		cards.remove(12);
	}
	if(card == 13) {
		System.out.println("You have been elected Chairman of the Board – Pay each player $50");
		//player.bank - 50 for playersCount - 1;
		cards.remove(13);
	}
	if(card == 14) {
		System.out.println("Your building loan matures – Collect $150");
		bank.pay(150 , activePlayer);
		cards.remove(14);
	}
	if(card == 15) {
		System.out.println("You have won a crossword competition - Collect $100");
		bank.pay(100 , activePlayer);
		cards.remove(15);
	}


	}
}

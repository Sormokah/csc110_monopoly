package csc110_monopoly;

<<<<<<< HEAD
public class Chance 
{
=======
import java.util.ArrayList;
import java.util.Random;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Chance {
	ArrayList<Integer> cards = new ArrayList<>();
	int maxCards = 16;
	
	
	public void deckChanceCards() {
		for(int i = 0; i < maxCards; i++) {
			cards.add(i);
		}
	}
	
	public void pickChance() {
	Random gen = new Random();
	int card = gen.nextInt(maxCards);
	
	if(card == 1) {
		System.out.println("Advance to Go (Collect $200)");
		//move to GO board[0];
		cards.remove(0);
	}
	if(card == 2) {
		System.out.println("Advance to Illinois Ave. - If you pass Go, collect $200");
		// move to Illinois Ave. board[24]
		//if board[24] is owned pay owner.
		cards.remove(1);
	}
	if(card == 3) {
		System.out.println("Advance to Illinois Ave. - If you pass Go, collect $200");
		//move to St. charles board[11]
		//if board[11] is owned pay owner.
		cards.remove(2);
	}
	if(card == 4) {
		System.out.println("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.");
		//if player.spot == 7 board[12]
		//if player.spot == 36 board [12] banker.payGo();
		//if player.spot == 22 board[28]
		//if player.spot == owned pay owner 10x (2d6)
		cards.remove(3);
	}
	if(card == 5) {
		System.out.println("Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
		//if player.spot[36] board[5]
		//if player.spot[7] board [15]
		//if player.spot[22] board [25]
		//if player.spot == owned pay 2(spot.rent)
		cards.remove(4);
	}
	if(card == 6) {
		System.out.println("Bank pays you dividend of $50");
		//banker.pay($50)
		cards.remove(5);
	}
	if(card == 7) {
		System.out.println("Get out of Jail Free – This card may be kept until needed, or traded/sold");
		//player.hasGetOutOfJailFreeChance = true;
		cards.remove(6);
	}
	if(card == 8) {
		System.out.println("Go Back 3 Spaces");
		//if player.spot == 7 board[4] && LuxaryTax();
		//if player.spot == 22 board[19] if board[19] == owned pay rent to owner.
		//if player.spot == 36 board[33] Community.pickChest();
		cards.remove(7);
	}
	if(card == 9) {
		System.out.println("Go to Jail – Go directly to Jail – Do not pass Go, do not collect $200");
		//player.spot [10]
		//player.isInJail = true;
		cards.remove(8);
	}
	if(card == 10) {
		System.out.println("Make general repairs on all your property – For each house pay $25 – For each hotel $100");
		//for loop, count houses times($25) payBank(amount);
		//for loop, count hotels times($100) payBank(amount);
		cards.remove(9);
	}
	if(card == 11) {
		System.out.println("Pay poor tax of $15");
		//payBank($15);
		cards.remove(10);
	}
	if(card == 12) {
		System.out.println("Take a trip to Reading Railroad – If you pass Go, collect $200");
		//if player.spot > 5 banker.payGo(); player.spot = 5;
		//if player.spot < 5 player.spot = 5;
		cards.remove(11);
	}
	if(card == 13) {
		System.out.println("Take a walk on the Boardwalk – Advance token to Boardwalk");
		//player.spot = board[39]; 
		//if board[39] is owned pay owner.
		cards.remove(12);
	}
	if(card == 14) {
		System.out.println("You have been elected Chairman of the Board – Pay each player $50");
		//player.bank - 50 for playersCount - 1;
		cards.remove(13);
	}
	if(card == 15) {
		System.out.println("Your building loan matures – Collect $150");
		//bank.pay($150);
		cards.remove(14);
	}
	if(card == 16) {
		System.out.println("You have won a crossword competition - Collect $100");
		//bank.pay($100);
		cards.remove(15);
	}
>>>>>>> 4433385c0b21458ca2f673f022835886c9153536

	}
}

package csc110_monopoly;

import java.util.ArrayList;

public class PropertyGenerator {
	
	ArrayList<Property> propertiesToLandOn = new ArrayList<>();

	public Property MediterraneanAvenue;
	public Property BalticAvenue;
	public Property OrientalAvenue;
	public Property VermontAvenue;
	public Property ConnecticutAvenue;
	public Property StCharlesPlace;
	public Property StatesAvenue;
	public Property VirginiaAvenue;
	public Property StJamesPlace;
	public Property TennesseeAvenue;
	public Property NewYorkAvenue;
	public Property KentuckyAvenue;
	public Property IndianaAvenue;
	public Property IllinoisAvenue;
	public Property AtlanticAvenue;
	public Property VentnorAvenue;
	public Property MarvinGardens;
	public Property PacificAvenue;
	public Property NorthCarolinaAvenue;
	public Property PennsylvaniaAvenue;
	public Property ParkPlace;
	public Property Boardwalk;
	public Property ElectricCompany;
	public Property WaterWorks;
	public Property ReadingRailroad;
	public Property PennsylvaniaRailroad;
	public Property BAndORailRoad;
	public Property ShortLine;
	///////////////////////////
	public Property IncomeTax;
	public Property LuxuryTax;
	
	public Property CommunityChest2;
	public Property CommunityChest17;
	public Property CommunityChest33;
	
	public Property Chance7;
	public Property Chance22;
	public Property Chance36;
	////////////////////////////
	public Property Go;
	public Property Jail;
	public Property FreeParking;
	public Property GoToJail;
	
	
	public void generateProperty(){
		
		
		
		MediterraneanAvenue = new Property(Properties.MediterraneanAvenue, 60, Colors.Brown, 2, 10, 30, 90, 160, 250, 30, 50, false, false, 1);
		propertiesToLandOn.add(MediterraneanAvenue);
		BalticAvenue = new Property(Properties.BalticAvenue, 60, Colors.Brown, 4, 20, 60, 180, 320, 450, 30, 50, false, false, 3);
		propertiesToLandOn.add(BalticAvenue);
		OrientalAvenue = new Property(Properties.OrientalAvenue, 100, Colors.Light_Blue, 6, 30, 90, 270, 400, 550, 50, 50, false, false, 6);
		propertiesToLandOn.add(OrientalAvenue);
		VermontAvenue = new Property(Properties.VermontAvenue, 100, Colors.Light_Blue, 6, 30, 90, 270, 400, 550, 50, 50, false, false, 8);
		propertiesToLandOn.add(VermontAvenue);
		ConnecticutAvenue = new Property(Properties.ConnecticutAvenue, 120, Colors.Light_Blue, 8, 40, 100, 300, 450, 600, 60, 50, false, false, 9);
		propertiesToLandOn.add(ConnecticutAvenue);
		StCharlesPlace = new Property(Properties.StCharlesPlace, 140, Colors.Pink, 10, 50, 150, 450, 625, 750, 70, 100, false, false, 11);
		propertiesToLandOn.add(StCharlesPlace);
		StatesAvenue = new Property(Properties.StatesAvenue, 140, Colors.Pink, 10, 50, 150, 450, 625, 750, 70, 100, false, false, 13);
		propertiesToLandOn.add(StatesAvenue);
		VirginiaAvenue = new Property(Properties.VirginiaAvenue, 160, Colors.Pink, 12, 60, 180, 500, 700, 900, 80, 100, false, false, 14);
		propertiesToLandOn.add(VirginiaAvenue);
		StJamesPlace = new Property(Properties.StJamesPlace, 180, Colors.Orange, 14, 70, 200, 550, 750, 950, 90, 100, false, false, 16);
		propertiesToLandOn.add(StJamesPlace);
		TennesseeAvenue = new Property(Properties.TennesseeAvenue, 180, Colors.Orange ,14, 70, 200, 550, 750, 950, 90, 100, false, false, 18);
		propertiesToLandOn.add(TennesseeAvenue);
		NewYorkAvenue = new Property(Properties.NewYorkAvenue, 200, Colors.Orange, 16, 80, 220, 600, 800, 1000, 100, 100, false, false, 19);
		propertiesToLandOn.add(NewYorkAvenue);
		KentuckyAvenue = new Property(Properties.KentuckyAvenue, 220, Colors.Red, 18, 90, 250, 700, 875, 1050, 110, 150, false, false, 21);
		propertiesToLandOn.add(KentuckyAvenue);
		IndianaAvenue = new Property(Properties.IndianaAvenue, 220, Colors.Red, 18, 90, 250, 700, 875, 1050, 110, 150, false, false, 23);
		propertiesToLandOn.add(IndianaAvenue);
		IllinoisAvenue = new Property(Properties.IllinoisAvenue, 240, Colors.Red, 20, 100, 300, 750, 925, 1100, 120, 150, false, false, 24);
		propertiesToLandOn.add(IllinoisAvenue);
		AtlanticAvenue = new Property(Properties.AtlanticAvenue, 260, Colors.Yellow, 22, 110, 330, 800, 975, 1150, 130, 150, false, false, 26);
		propertiesToLandOn.add(AtlanticAvenue);
		VentnorAvenue = new Property(Properties.VentnorAvenue, 260, Colors.Yellow, 22, 110, 330, 800, 975, 1150, 130, 150, false, false, 27);
		propertiesToLandOn.add(VentnorAvenue);
		MarvinGardens = new Property(Properties.MarvinGardens, 280, Colors.Yellow, 24, 120, 360, 850, 1025, 1200, 140, 150, false, false, 29);
		propertiesToLandOn.add(MarvinGardens);
		PacificAvenue = new Property(Properties.PacificAvenue, 300, Colors.Green, 26, 130, 390, 900, 1100, 1275, 150, 200, false, false, 31);
		propertiesToLandOn.add(PacificAvenue);
		NorthCarolinaAvenue = new Property(Properties.NorthCarolinaAvenue, 300, Colors.Green, 26, 130, 390, 900, 1100, 1275, 150, 200, false, false, 32);
		propertiesToLandOn.add(NorthCarolinaAvenue);
		PennsylvaniaAvenue = new Property(Properties.PennsylvaniaAvenue, 320, Colors.Green, 28, 150, 450, 1000, 1200, 1400, 160, 200, false, false, 34);
		propertiesToLandOn.add(PennsylvaniaAvenue);
		ParkPlace = new Property(Properties.ParkPlace, 350, Colors.Navy, 35, 175, 500, 1100, 1300, 1500, 175, 200, false, false, 37);
		propertiesToLandOn.add(ParkPlace);
		Boardwalk = new Property(Properties.Boardwalk, 400, Colors.Navy, 50, 200, 600, 1400, 1700, 2000, 200, 200, false, false, 38);
		propertiesToLandOn.add(Boardwalk);

		ElectricCompany = new Property(Properties.ElectricCompany, 150, Colors.Utility, 75, false, false, 22);
		propertiesToLandOn.add(ElectricCompany);
		WaterWorks = new Property(Properties.WaterWorks, 150, Colors.Utility, 75, false, false, 28);
		propertiesToLandOn.add(WaterWorks);
		ReadingRailroad = new Property(Properties.ReadingRailroad, 200, Colors.Railroad, 100, false, false, 5);
		propertiesToLandOn.add(ReadingRailroad);
		PennsylvaniaRailroad = new Property(Properties.PennsylvaniaRailroad, 200, Colors.Railroad, 100, false, false, 15);
		propertiesToLandOn.add(PennsylvaniaRailroad);
		BAndORailRoad = new Property(Properties.BAndORailroad, 200, Colors.Railroad, 100, false, false, 25);
		propertiesToLandOn.add(BAndORailRoad);
		ShortLine = new Property(Properties.ShortLine, 200, Colors.Railroad, 100, false, false, 35);
		propertiesToLandOn.add(ShortLine);
			
		IncomeTax = new Property(4);
		propertiesToLandOn.add(IncomeTax);
		LuxuryTax = new Property(38);
		propertiesToLandOn.add(LuxuryTax);

		CommunityChest2 = new Property(2);
		propertiesToLandOn.add(CommunityChest2);
		CommunityChest17 = new Property(17);
		propertiesToLandOn.add(CommunityChest17);
		CommunityChest33 = new Property(33);
		propertiesToLandOn.add(CommunityChest33);

		Chance7 = new Property(7);
		propertiesToLandOn.add(Chance7);
		Chance22 = new Property(22);
		propertiesToLandOn.add(Chance22);
		Chance36 = new Property(36);
		propertiesToLandOn.add(Chance36);

		Go = new Property(0);
		propertiesToLandOn.add(Go);
		Jail = new Property(10);
		propertiesToLandOn.add(Jail);
		FreeParking = new Property(20);
		propertiesToLandOn.add(FreeParking);
		GoToJail = new Property(30);
		propertiesToLandOn.add(GoToJail);
	}
	
}

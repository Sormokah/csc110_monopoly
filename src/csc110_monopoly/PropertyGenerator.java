package csc110_monopoly;

public class PropertyGenerator {

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
	
	
	public void generateProperty(){
		
		MediterraneanAvenue = new Property(Properties.MediterraneanAvenue, 60, Colors.Brown, 2, 10, 30, 90, 160, 250, 30, 50, false, false);
		BalticAvenue = new Property(Properties.BalticAvenue, 60, Colors.Brown, 4, 20, 60, 180, 320, 450, 30, 50, false, false);
		OrientalAvenue = new Property(Properties.OrientalAvenue, 100, Colors.Light_Blue, 6, 30, 90, 270, 400, 550, 50, 50, false, false);
		VermontAvenue = new Property(Properties.VermontAvenue, 100, Colors.Light_Blue, 6, 30, 90, 270, 400, 550, 50, 50, false, false);
		ConnecticutAvenue = new Property(Properties.ConnecticutAvenue, 120, Colors.Light_Blue, 8, 40, 100, 300, 450, 600, 60, 50, false, false);
		StCharlesPlace = new Property(Properties.StCharlesPlace, 140, Colors.Pink, 10, 50, 150, 450, 625, 750, 70, 100, false, false);
		StatesAvenue = new Property(Properties.StatesAvenue, 140, Colors.Pink, 10, 50, 150, 450, 625, 750, 70, 100, false, false);
		VirginiaAvenue = new Property(Properties.VirginiaAvenue, 160, Colors.Pink, 12, 60, 180, 500, 700, 900, 80, 100, false, false);
		StJamesPlace = new Property(Properties.StJamesPlace, 180, Colors.Orange, 14, 70, 200, 550, 750, 950, 90, 100, false, false);
		TennesseeAvenue = new Property(Properties.TennesseeAvenue, 180, Colors.Orange ,14, 70, 200, 550, 750, 950, 90, 100, false, false);
		NewYorkAvenue = new Property(Properties.NewYorkAvenue, 200, Colors.Orange, 16, 80, 220, 600, 800, 1000, 100, 100, false, false);
		KentuckyAvenue = new Property(Properties.KentuckyAvenue, 220, Colors.Red, 18, 90, 250, 700, 875, 1050, 110, 150, false, false);
		IndianaAvenue = new Property(Properties.IndianaAvenue, 220, Colors.Red, 18, 90, 250, 700, 875, 1050, 110, 150, false, false);
		IllinoisAvenue = new Property(Properties.IllinoisAvenue, 240, Colors.Red, 20, 100, 300, 750, 925, 1100, 120, 150, false, false);
		AtlanticAvenue = new Property(Properties.AtlanticAvenue, 260, Colors.Yellow, 22, 110, 330, 800, 975, 1150, 130, 150, false, false);
		VentnorAvenue = new Property(Properties.VentnorAvenue, 260, Colors.Yellow, 22, 110, 330, 800, 975, 1150, 130, 150, false, false);
		MarvinGardens = new Property(Properties.MarvinGardens, 280, Colors.Yellow, 24, 120, 360, 850, 1025, 1200, 140, 150, false, false);
		PacificAvenue = new Property(Properties.PacificAvenue, 300, Colors.Green, 26, 130, 390, 900, 1100, 1275, 150, 200, false, false);
		NorthCarolinaAvenue = new Property(Properties.NorthCarolinaAvenue, 300, Colors.Green, 26, 130, 390, 900, 1100, 1275, 150, 200, false, false);
		PennsylvaniaAvenue = new Property(Properties.PennsylvaniaAvenue, 320, Colors.Green, 28, 150, 450, 1000, 1200, 1400, 160, 200, false, false);
		ParkPlace = new Property(Properties.ParkPlace, 350, Colors.Navy, 35, 175, 500, 1100, 1300, 1500, 175, 200, false, false);
		Boardwalk = new Property(Properties.Boardwalk, 400, Colors.Navy, 50, 200, 600, 1400, 1700, 2000, 200, 200, false, false);

	}
	
}

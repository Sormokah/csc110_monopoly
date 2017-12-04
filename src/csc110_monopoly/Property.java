package csc110_monopoly;

public class Property 
{
	
	
	
	private Properties name;
	private int priceToBuy;
	
	private Colors color;
	private boolean hasAllOfColor;
	
	
	private int baseRent;
	private int with1House;
	private int with2Houses;
	private int with3Houses;
	private int with4Houses;
	private int withHotel;
	
	private int mortgageValue;
	private boolean mortgaged;
	
	int houseCost;
	
	
	
	public Property(Properties name, int priceToBuy, Colors color, int baseRent, int with1House, int with2Houses,
			int with3Houses, int with4Houses, int withHotel, int mortgageValue, int houseCost,
			boolean hasAllOfColor, boolean mortgaged){
		this.name = name;
		this.priceToBuy = priceToBuy;
		this.color = color;
		this.baseRent = baseRent;
		this.with1House = with1House;
		this.with2Houses = with2Houses;
		this.with3Houses = with3Houses;
		this.with4Houses = with4Houses;
		this.withHotel = withHotel;
		this.mortgageValue = mortgageValue;
		this.houseCost = houseCost;
		this.hasAllOfColor = hasAllOfColor;
		this.mortgaged = mortgaged;
	}
	
	public void calculateRailroadRent(int railroadsOwned)
	{
		//for(Player: )
	}
}

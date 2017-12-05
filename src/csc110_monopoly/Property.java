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
	private int location;
	fds
	int houseCost;
	
	
	//regular properties
	public Property(Properties name, int priceToBuy, Colors color, int baseRent, int with1House, int with2Houses,
			int with3Houses, int with4Houses, int withHotel, int mortgageValue, int houseCost,
			boolean hasAllOfColor, boolean mortgaged, int location){
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
		this.location = location;
	}
	//utilities and railroads
	public Property(Properties name, int priceToBuy, Colors color, int mortgageValue, boolean mortgaged, boolean hasAllOfColor, int location)
	{
		this.name = name;
		this.priceToBuy = priceToBuy;
		this.color = color;
		this.mortgageValue = mortgageValue;
		this.mortgaged = mortgaged;
		this.location = location;
	}
	//misc
	public Property(int location)
	{
		this.location = location;
	}
	
	
	public void calculateRailroadRent(int railroadsOwned)
	{
		//for(Player: )
	}
}

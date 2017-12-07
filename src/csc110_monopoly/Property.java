package csc110_monopoly;

public class Property 
{
	
	
	private int housesOnProperty = 0;
	private boolean hasHotel = false;
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
	public int getHousesOnProperty() {
		return housesOnProperty;
	}
	public void setHousesOnProperty(int housesOnProperty) {
		this.housesOnProperty = housesOnProperty;
	}
	public boolean isHasHotel() {
		return hasHotel;
	}
	public void setHasHotel(boolean hasHotel) {
		this.hasHotel = hasHotel;
	}
	public Properties getName() {
		return name;
	}
	public void setName(Properties name) {
		this.name = name;
	}
	public int getPriceToBuy() {
		return priceToBuy;
	}
	public void setPriceToBuy(int priceToBuy) {
		this.priceToBuy = priceToBuy;
	}
	public Colors getColor() {
		return color;
	}
	public void setColor(Colors color) {
		this.color = color;
	}
	public boolean isHasAllOfColor() {
		return hasAllOfColor;
	}
	public void setHasAllOfColor(boolean hasAllOfColor) {
		this.hasAllOfColor = hasAllOfColor;
	}
	public int getBaseRent() {
		return baseRent;
	}
	public void setBaseRent(int baseRent) {
		this.baseRent = baseRent;
	}
	public int getWith1House() {
		return with1House;
	}
	public void setWith1House(int with1House) {
		this.with1House = with1House;
	}
	public int getWith2Houses() {
		return with2Houses;
	}
	public void setWith2Houses(int with2Houses) {
		this.with2Houses = with2Houses;
	}
	public int getWith3Houses() {
		return with3Houses;
	}
	public void setWith3Houses(int with3Houses) {
		this.with3Houses = with3Houses;
	}
	public int getWith4Houses() {
		return with4Houses;
	}
	public void setWith4Houses(int with4Houses) {
		this.with4Houses = with4Houses;
	}
	public int getWithHotel() {
		return withHotel;
	}
	public void setWithHotel(int withHotel) {
		this.withHotel = withHotel;
	}
	public int getMortgageValue() {
		return mortgageValue;
	}
	public void setMortgageValue(int mortgageValue) {
		this.mortgageValue = mortgageValue;
	}
	public boolean isMortgaged() {
		return mortgaged;
	}
	public void setMortgaged(boolean mortgaged) {
		this.mortgaged = mortgaged;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getHouseCost() {
		return houseCost;
	}
	public void setHouseCost(int houseCost) {
		this.houseCost = houseCost;
	}
	
	
}

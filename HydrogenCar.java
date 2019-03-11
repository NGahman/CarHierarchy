
public class HydrogenCar extends NoEmissionsCar
{
	private boolean infastructure;
	public HydrogenCar() 
	{
		this.infastructure = false;
	}
	public HydrogenCar(double miles, int yearmade, double price, double fuelcost, boolean infastructure)
	{
		super(miles, yearmade, price, fuelcost);
		this.infastructure = infastructure;
	}
	@Override
	public void setFuelCost(double fuelcost) 
	{
		this.fuelcost = fuelcost;
	}
	@Override
	public double getFuelCost() 
	{
		return this.fuelcost;
	}
	public void setInfastructure(boolean infastructure)
	{
		this.infastructure = infastructure;
	}
	public boolean getInfastructure(boolean infastructure)
	{
		return this.infastructure;
	}
	@Override
	public String toString()
	{
		return "\nmiles: "+miles+"\nyear made: "+yearmade+"\nprice: "+price+"\nfuel cost: "+fuelcost+"\ninfastructure: "+infastructure;
	}
}

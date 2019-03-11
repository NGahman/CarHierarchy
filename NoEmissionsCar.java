
public abstract class NoEmissionsCar extends AlternativeEnergyCar
{
	protected double fuelcost;
	public NoEmissionsCar()
	{
		this.fuelcost = 30;
	}
	public NoEmissionsCar(double miles, int yearmade, double price, double fuelcost)
	{
		super(miles, yearmade, price);
		this.fuelcost = fuelcost;
	}
	public abstract void setFuelCost(double fuelcost);
	public abstract double getFuelCost();
}

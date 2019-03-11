
public class ElectricCar extends NoEmissionsCar
{
	private double batterycharge;
	public ElectricCar() 
	{
		this.batterycharge = 100;
	}
	public ElectricCar(double miles, int yearmade, double price, double fuelcost, double batterycharge)
	{
		super(miles, yearmade, price, fuelcost);
		this.batterycharge = batterycharge;
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
	public void setBatteryCharge(double batterycharge) 
	{
		this.batterycharge = batterycharge;
	}
	public double getBatteryCharge() 
	{
		return this.batterycharge;
	}
	@Override
	public String toString()
	{
		return "\nmiles: "+miles+"\nyear made: "+yearmade+"\nprice: "+price+"\nfuel cost: "+fuelcost+"\nbattery charge: "+batterycharge;
	}

}

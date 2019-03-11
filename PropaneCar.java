public class PropaneCar extends EmissionsCar
{
	private boolean infastructure;
	public PropaneCar() 
	{
		this.infastructure = true;
	}
	public PropaneCar(double miles, int yearmade, double price, double emissions, boolean infastructure)
	{
		super(miles, yearmade, price, emissions);
		this.infastructure = infastructure;
	}
	@Override
	public void setEmissions(double emissions) 
	{
		this.emissions = emissions;
		
	}
	@Override
	public double getEmissions() 
	{
		return this.emissions;
	}
	public void setMethaneEmissions(boolean infastructure) 
	{
		this.infastructure = infastructure;
		
	}
	public boolean getMethaneEmissions() 
	{
		return this.infastructure;
	}
	@Override
	public String toString()
	{
		return "\nmiles: "+miles+"\nyear made: "+yearmade+"\nprice: "+price+"\nemissions: "+emissions+"\ninfastructure: "+infastructure;
	}

}

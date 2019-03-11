
public class NaturalGasCar extends EmissionsCar
{
	private double methaneemissions;
	public NaturalGasCar() 
	{
		this.methaneemissions = 15;
	}
	public NaturalGasCar(double miles, int yearmade, double price, double emissions, double methaneemissions)
	{
		super(miles, yearmade, price, emissions);
		this.methaneemissions = methaneemissions;
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
	public void setMethaneEmissions(double methaneemissions) 
	{
		this.methaneemissions = methaneemissions;
		
	}
	public double getMethaneEmissions() 
	{
		return this.methaneemissions;
	}
	@Override
	public String toString()
	{
		return "\nmiles: "+miles+"\nyear made: "+yearmade+"\nprice: "+price+"\nemissions: "+emissions+"\nmethane emissions: "+methaneemissions;
	}

}


public abstract class EmissionsCar extends AlternativeEnergyCar
{
	protected double emissions;
	public EmissionsCar()
	{
		this.emissions = 30;
	}
	public EmissionsCar(double miles, int yearmade, double price, double emissions)
	{
		super(miles, yearmade, price);
		this.emissions = emissions;
	}
	public abstract void setEmissions(double emissions);
	public abstract double getEmissions();
}

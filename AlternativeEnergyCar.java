
public class AlternativeEnergyCar implements Comparable<AlternativeEnergyCar>
{
	protected double miles;
	protected int yearmade;
	protected double price;
	
	public AlternativeEnergyCar()
	{
		this.miles = 0;
		this.yearmade = 2019;
		this.price = 50000;
	}
	public AlternativeEnergyCar(double miles, int yearmade, double price)
	{
		this.miles = miles;
		this.yearmade = yearmade;
		this.price = price;
	}
	public void setMiles(double miles)
	{
		this.miles = miles;
	}
	public void setYearMade(int yearmade)
	{
		this.yearmade = yearmade;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getMiles()
	{
		return this.miles;
	}
	public int getYearMade(int yearmade)
	{
		return this.yearmade;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String toString()
	{
		return "\nmiles: "+miles+"\nyear made: "+yearmade+"\nprice: "+price;
	}
	public int compareTo(AlternativeEnergyCar otherAECar)
	{
		return -1*(Double.valueOf(otherAECar.getPrice()).compareTo(this.price));
	}
	
}

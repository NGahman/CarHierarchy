import java.util.*;
public class CarDriver 
{
	public static void main(String[] args) 
	{
		AlternativeEnergyCar car1 = new AlternativeEnergyCar(10000, 2010, 10000);
		AlternativeEnergyCar car2 = new HydrogenCar(0, 2019, 40000, 100, false);
		AlternativeEnergyCar car3 = new ElectricCar(0, 2019, 30000, 10, 50);
		AlternativeEnergyCar car4 = new NaturalGasCar(0, 2015, 20000, 5, 20);
		AlternativeEnergyCar car5 = new PropaneCar(0, 2019, 25000, 10, true);
		
		ArrayList<AlternativeEnergyCar> cars = new ArrayList<AlternativeEnergyCar>();
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		Collections.sort(cars);
		System.out.println(cars);
		
	}

}

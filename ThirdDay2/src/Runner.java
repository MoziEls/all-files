
public class Runner {

	public static void main(String[] args) {
		
		Car c1= new Car("KM245t4","Toyta",2009);
		Car c2= new Car("RT345Y5","mercedes",2015);
		
		c1.speed();
		System.out.println(c1.carType + "speed is 50kmh");
		System.out.println(c2.carType + "speed is 1000kmh");

	}

}

package interfacechanges;

public class CarDriver {

	public static void main(String[] args) {
		Vehicle c=new Car();
		c.vehicleStart();
		
		
		Car a=(Car) c;
		a.sound();
		a.vehicleStop();
		Vehicle.size();
		

	}

}

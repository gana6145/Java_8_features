package interfacechanges;

public class Car implements Vehicle {

	@Override
	public void vehicleStart() {
		System.out.println("Vehicle Stated Successfully");
		
	}
	public void sound() {
		System.out.println("boom");
	}
	
	public void vehicleStop() {
		System.out.println("vehicle stop");
	}
	
	

}

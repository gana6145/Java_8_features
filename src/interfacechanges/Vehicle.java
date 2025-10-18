package interfacechanges;

public interface Vehicle {
	int num=10;
	
	
	public void vehicleStart();
	default void nnumberSeat() {
		System.out.println("4 seate are manadetory");
	}
	public static void size() {
		System.out.println("4 wheeler duster");
		
	}

}

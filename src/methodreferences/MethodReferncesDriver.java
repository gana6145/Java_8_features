package methodreferences;

interface MyInterface{
	public void m1();
}

public class MethodReferncesDriver {

	
	public static void m2() {
		System.out.println("m2 called");
	}
	public static void main(String[] args) {
		
		MyInterface mi=MethodReferncesDriver::m2;
		mi.m1();
		

	}

}

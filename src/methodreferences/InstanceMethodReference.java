package methodreferences;

public class InstanceMethodReference {
	
	public void m1() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		InstanceMethodReference ref=new InstanceMethodReference();
		Runnable r=ref::m1;
		Thread t =new Thread(r);
		Thread t1 =new Thread(r);
		t.start();
		t1.start();
		
				
	}

}

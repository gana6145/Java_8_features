package lambdaexpression;

public class Demo {
	@FunctionalInterface
	interface Addable  {
		void add(int a,int b);
		
	}
	
	@FunctionalInterface
	interface Length{
		int length(String name);
		
		
	}
	public static void main(String[] args) {
		
		Addable adder=(a,b)-> System.out.println(a+b);
		adder.add(10,20);
		
		Length l1=name->name.length();
		System.out.println(l1.length("ganesh"));
	}

}

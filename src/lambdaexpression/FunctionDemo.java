package lambdaexpression;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		String names[]= {"Ganesh","saurabh","Pratik"};
		
		Function<String,Integer> f=(name)-> name.length();
		for(String name:names) {
			System.out.println(f.apply(name));
		}
		
	}

}

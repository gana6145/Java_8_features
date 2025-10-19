package lambdaexpression;

import java.util.function.Predicate;

public class PredicateDriver2 {

	public static void main(String[] args) {
		String arr[]= {"ganesh","ajinkya","ankit","aishwarya","nikhil","Anu","Anushka"};
		
		Predicate <String> p= i -> i.charAt(0)=='a'||i.charAt(0)=='A';
		for(String name:arr) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
		
		

	}

}

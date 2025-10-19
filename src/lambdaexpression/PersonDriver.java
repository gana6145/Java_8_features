package lambdaexpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PersonDriver {

	public static void main(String[] args) {
		ArrayList <Person> p=new ArrayList<>();
		p.add(new Person("Ganesh", "jadhav.ganesh1700@gmail.com", 22));
		p.add(new Person("Saurabh", "jadhav.saurabh1700@gmail.com", 25));
		p.add(new Person("Pratik", "jadhav.pratik5000@gmail.com", 23));
		p.add(new Person("priyanka", "jadhav.priyanka1997@gmail.com", 26));
		
		
		Predicate <Integer> pi=age->age%2==0;
		
		for(Person pers:p) {
			if(pi.test(pers.age)) {
				System.out.println(pers);
			}
			
		}
		
	}

}

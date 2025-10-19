package lambdaexpression;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> s= (name)-> System.out.println(name);
		s.accept("ganesh");
		s.accept("mangesh");
		s.accept("hello");
		
		String arr[]= {"ganesh","satish","jadhav"};
		for(String name:arr) {
			s.accept(name);
		}
			
		
	}

}

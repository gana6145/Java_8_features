package streamapi;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("ganesh","saurabh","pratik");
//		for(String name:names) {
//			System.out.println(name.toUpperCase());
//		}
		
		names.stream().map(name->name.toUpperCase()).forEach(name->System.out.println(name));
		
	}

}

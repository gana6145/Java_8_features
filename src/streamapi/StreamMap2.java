package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

public class StreamMap2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("ganesh","saurabh","pratik");
		names.stream().map(name->name.length()).forEach(i->System.out.println(i));
	}

}

package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Strream1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60,7,8,9,70,80,90);
		
//		Stream<Integer> str1=list.stream();
//		Stream<Integer> filter=str1.filter(i->i>20);
//		filter.forEach(i->System.out.println(i));
		
		list.stream().filter(i->i<20).forEach(i->System.out.print(i+" "));
		System.out.println();
		list.stream().filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Ganesh");
		name.add("jadhav");
		name.add("saurabh");
		name.add("pratik");
		name.add("omkar");
		name.add("uttam");
		name.add("Ganesh");
		
		name.stream().filter(name1->name1.charAt(1)=='a').forEach(name1->System.out.println(name1));
	
	}

}

package methodreferences;

import java.util.ArrayList;
import java.util.*;

public class NumberSort {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(340);
		list.add(330);
		list.add(320);
	    list.add(310);
	    System.out.println(list);
		
	   Collections.sort(list,(i,j)->i>j?1:-1);
	   System.out.println(list);
	   list.forEach(i->System.out.println(i));
		

	}

}

package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		sj.add("Ganesh");
		sj.add("Ganesh");
		sj.add("Ganesh");
		sj.add("Ganesh");
		System.out.println(sj);
		StringJoiner sj1=new StringJoiner(",","(",")");
		sj1.add("Ganesh");
		sj1.add("Ganesh");
		sj.add("Ganesh");
		sj1.add("Ganesh");
		System.out.println(sj1);

	}

}

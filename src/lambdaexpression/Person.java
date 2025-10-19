package lambdaexpression;

public class Person {
	String name;
	String emailId;
	int age;
	public Person(String name,String emailId,int age) {
		this.name=name;
		this.emailId=emailId;
		this.age=age;
	}
	
	public String toString() {
		return "[ name:"+name +",EmailId: " + emailId+ ", Age:" +age+ "]";
	}
	

}

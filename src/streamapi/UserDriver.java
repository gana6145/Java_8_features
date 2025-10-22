package streamapi;

import java.util.stream.Stream;

public class UserDriver {

	public static void main(String[] args) {
		User u1=new User("ganesh",22);
		User u2=new User("Saurabh",25);
		User u3=new User("Parik",24);
		User u4=new User("om",19);
		User u5=new User("jaggu",23);
//        System.out.println(u1);
        Stream<User> a1=Stream.of(u1,u2,u3,u4,u5);
        a1.filter(user->user.age<20).forEach(user->System.out.println(user));
	}

}

class User{
	String name;
	int age;
	User(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "[Name:"+name+ " Age:" +age+"]";
	}
	
	
}
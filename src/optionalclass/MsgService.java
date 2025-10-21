package optionalclass;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int userId=scan.nextInt();
		User u=new User();
		
		
		Optional<String> name=u.getUserName(userId);
		String msg ;
		
		if(name.isPresent()) {
		 msg=name.get().toUpperCase()+ ",Hello";
		}
		else {
			System.out.println("no data found");
		}
		
		
		
				
		

	}

}

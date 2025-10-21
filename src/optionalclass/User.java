package optionalclass;

import java.util.Optional;

public class User {

	
	public Optional<String> getUserName(int id) {
		String name=null;
		if(id==100) {
			name="raju";
		}
		if(id==101) {
			name="rani";
		}
		return Optional.ofNullable(null);
	}
	

}

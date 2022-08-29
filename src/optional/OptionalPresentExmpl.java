package optional;

import java.util.Optional;

public class OptionalPresentExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isPresent is telling u whether the value is present or not 
		 Optional<String> stringOptional = Optional.ofNullable("Hello Optional");

	        System.out.println(stringOptional.isPresent());

	        //ifPresent will check if any value is present or not then do some task on top of it
	        stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
	}

}

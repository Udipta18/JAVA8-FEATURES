package optional;

import java.util.Optional;

public class OptionalOfEmpty {
	
	
  //it is used when u are uncertain about the thing that whether it send null or not
	    public static Optional<String> ofNullable(){

	       return  Optional.ofNullable("Hello");

	    }
//when u are 100% sure of the fact that it will return some valid String
	    public static Optional<String> of(){

	        return  Optional.of("Hello");
	       // return  Optional.of(null);

	    }

	    public static Optional<String> empty(){

	        return  Optional.empty();
	        // return  Optional.of(null);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(ofNullable().get());
	        System.out.println(of());
	        System.out.println(empty().get());
	}

}

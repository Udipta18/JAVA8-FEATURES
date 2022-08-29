package Defaults;

import java.util.List;

public class MultiplyImpl implements Multiply {

	 @Override
	    public int multiply(List<Integer> integerList) {

	        return integerList
	                .stream()
	                .reduce(1, (x,y) -> x*y);
	    }

	 
	 //DEFAULT METHOD CAN GETTING OVERRIDE IN IMPL CLASS AND IT WILL BE USED IN RUNTIME
	    @Override
	     public int size(List<Integer> integerList){
	         System.out.println("Inside Implementation class");
	        return integerList.size();
	    }

}

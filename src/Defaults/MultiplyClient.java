package Defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplyClient {

	public static void main(String[] args) {
		Multiply multiply = new MultiplyImpl();
        List<Integer> inputList = Arrays.asList(1,3,5);
        System.out.println("Result is : " + multiply.multiply(inputList));
        System.out.println("Input List size is : " + multiply.size(inputList));
      //Static method can be called with Interface name only
        System.out.println("Is Empty : " + Multiply.isEmpty(inputList)); 
	}

}

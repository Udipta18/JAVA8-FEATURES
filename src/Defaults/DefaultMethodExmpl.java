package Defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> stringList  = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");

	       /* Collections.sort(stringList);
	        * IT IS USED TO SORT PRIOR JAVA8
	        System.out.println("Sorted list : " +  stringList);
	       */

	        stringList.sort(Comparator.naturalOrder());

	        System.out.println("Sorted list : " +  stringList);

	        stringList.sort(Comparator.reverseOrder());

	        System.out.println("Reverse Sorted list : " +  stringList);


	}

}

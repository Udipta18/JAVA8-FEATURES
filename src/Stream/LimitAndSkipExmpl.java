package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitAndSkipExmpl {
	
	//IT WILL ADD ONLY FIRST TWO VALUES
	public static Optional<Integer> limit(List<Integer> li) {

		return li.stream().limit(2).reduce((a, b) -> a+b);
	}
	
	
	//IT WILL SKIP THE 11FIRST TWO VALUES
	public static Optional<Integer> skip(List<Integer> li) {

		return li.stream().skip(2).reduce((a, b) -> a+b);
	}

	
	public static void main(String[] args) {
     
		List<Integer> li = Arrays.asList(1, 3, 56, 7, 8);
		
		Optional<Integer> maxValue2 = limit(li);
		if(maxValue2.isPresent()) {
			System.out.println(maxValue2.get());
		}
		else {
			System.out.println("MAAX VALUE NOT PRESENT");
		}
		
		Optional<Integer> maxValue3 = skip(li);
		if(maxValue3.isPresent()) {
			System.out.println(maxValue3.get());
		}
		else {
			System.out.println("MAAX VALUE NOT PRESENT");
		}
	}
}

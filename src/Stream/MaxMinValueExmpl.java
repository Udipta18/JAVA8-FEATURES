package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinValueExmpl {

	// this in absolutely fine for list that is not empty
	// but if the list is empty then it will send 0 which is not correct
	public static int maxValue(List<Integer> li) {

		return li.stream().reduce(0, (a, b) -> a > b ? a : b);
	}

	// to solve the above issue we will use optional

	public static Optional<Integer> maxValue2(List<Integer> li) {

		return li.stream().reduce((a, b) -> a > b ? a : b);
	}

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 3, 56, 7, 8);

		System.out.println(maxValue(li));
		
		Optional<Integer> maxValue2 = maxValue2(li);
		if(maxValue2.isPresent()) {
			System.out.println(maxValue2.get());
		}
		else {
			System.out.println("MAAX VALUE NOT PRESENT");
		}

	}
}

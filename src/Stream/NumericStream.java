package Stream;

import java.util.stream.IntStream;

public class NumericStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int sum = IntStream.rangeClosed(1, 4).sum();
              System.out.println(sum);
              IntStream.rangeClosed(1, 5).asDoubleStream().forEach((v -> System.out.print(v+" ")));
              System.out.println();
              double sum2 = IntStream.rangeClosed(1, 5).asDoubleStream().sum();
              System.out.println(sum2);
	}

}

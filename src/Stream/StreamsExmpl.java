package Stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsExmpl {

	static Predicate<Student> st=(st) -> st.getGpa()>=3.9;
	
	public static void main(String[] args) {
		List<Student> list = StudentDataBase.getAllStudents().stream()
				.filter((st) -> st.getGender().equalsIgnoreCase("female")).filter(st).collect(Collectors.toList());
		
		System.out.println(list);
	}
}

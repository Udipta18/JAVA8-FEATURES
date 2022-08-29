package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class ComparatorExmpl {

	static Function<Student,Double> name=(st) -> {
	       
	       return st.getGpa();
	};
	
	public static List<Student> compareByName() {
		List<Student> list = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed())
				.collect(Collectors.toList());
		
		return list;
	}
	
	
	public static List<Student> compareByGpa() {
		List<Student> list = StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(name).reversed() )
				.collect(Collectors.toList());
		
		return list;
	}
	

	public static void main(String[] args) {
        //  System.out.println(compareByName());
          System.out.println(compareByGpa());
	}
}

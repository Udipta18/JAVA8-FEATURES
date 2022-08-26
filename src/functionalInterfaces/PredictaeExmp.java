package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredictaeExmp {
	
	/**
	 * 
	 * PREDICATE TAKES ONE INPUT AND RETURN A BOOLEAN
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		filterStudent();
	}

	
	static Predicate<Student> predicate1=(student) -> student.getGpa()>=4;
	static Predicate<Student> predicate2=(student) -> student.getGradeLevel()>=3;
	
	public static void filterStudent() {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach((st ->{
			if(predicate1.and(predicate2).test(st))
				System.out.println(st.getName());
		}));
	}
}

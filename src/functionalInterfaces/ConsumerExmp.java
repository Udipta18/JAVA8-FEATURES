package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExmp {

	/**
	 * CONSUMER TAKES ONE INPUT RETURN NONE(VOID)
	 */
	
	
	static Consumer<Student> c2 = (st) -> System.out.println(st);
	static Consumer<Student> c4 = (st) -> System.out.print(st.getName() + " ->");
	static Consumer<Student> c3 = (st) -> System.out.println(st.getActivities());

	public static void main(String[] args) {

		// printAllStudents();
		//printActivities();
		sortByCondition();
	}

	public static void printAllStudents() {

		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(c2);
	}

	public static void printActivities() {

		List<Student> allStudents2 = StudentDataBase.getAllStudents();
		allStudents2.forEach(c4.andThen(c3));
	}
	
	public static void sortByCondition() {
		List<Student> allStudents3 = StudentDataBase.getAllStudents();
		allStudents3.forEach((student)->{
		  if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
			  c4.andThen(c3).accept(student);
		  }
		});
	}
}

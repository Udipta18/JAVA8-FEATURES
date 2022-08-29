package functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.*;

import data.Student;
import data.StudentDataBase;

public class combiningAll {

	static Predicate<Student> p1 = (st) -> st.getGpa() >= 4;
	static Predicate<Student> p2 = (st) -> st.getGradeLevel() >= 3;

	static BiConsumer<String, List<String>> biConsumer = (st, act) -> System.out.println(st + ":" + act + ":");

	public static void print(List<Student> allStudents) {
            allStudents.forEach(st ->{
            	if(p1.and(p2).test(st)) {
            		biConsumer.accept(st.getName(), st.getActivities());
            	}
            });
	}

	public static void main(String[] args) {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		print(allStudents);
	}

}

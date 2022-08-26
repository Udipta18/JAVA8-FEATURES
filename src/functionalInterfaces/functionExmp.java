package functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

import java.util.*;

public class functionExmp {

	
	/**
	 * FUNCTION TAKES ONE INPUT RETURN ANOTHER
	 */
	
	static Predicate<Student> predicate1= st -> st.getGpa()>=3.9;
	static Predicate<Student> predicate2= st -> st.getGradeLevel()>=3;
	static Function<List<Student>, List<String>> liFunction = st -> {
		List<String> li = new ArrayList<>();
		st.forEach(st1 -> {
            if(predicate1.test(st1))
			  li.add(st1.getName());

		});

		return li;
	};
	
	static Function<List<Student>, Map<String,Integer>> liFunction2= st -> {
		Map<String,Integer> map=new HashMap<>();
		st.forEach(st1 -> {
            if(predicate1.and(predicate2).test(st1)) {
			  map.put(st1.getName(), st1.getGradeLevel());
            }

		});

		return map;
	};

	
	public static void main(String[] args) {
		System.out.println(liFunction2.apply(StudentDataBase.getAllStudents()));
	}
}

package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDataBase;

public class BiConsumerExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nameAndActivities();

	}

	public static void nameAndActivities() {
		BiConsumer<String, List<String>> biConsumer=(name,activities) ->{
			 System.out.println(name + " :"+activities );
		};
		List<Student> allStudents2 = StudentDataBase.getAllStudents();
		allStudents2.forEach((student -> 
			biConsumer.accept(student.getName(),student.getActivities())
		
		));
	}

}

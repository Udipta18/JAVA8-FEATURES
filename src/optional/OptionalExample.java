package optional;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class OptionalExample {
	
	
	public static String getStudentName() {
		
		//if thye student datavbase is empty the it will give us nullpointer exception so 
		//to avoid that we will use optional
		Student student = StudentDataBase.studentSupplier.get();
		return student.getName();
	}
	
	public static Optional<String> optionalGetStudentName() {
		
		//to check the null pointer exception we use optional here
		      Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		      if(student.isPresent()) {
		    	  return student.map(Student::getName);
		      }
		      
		      return Optional.empty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Optional<String> studentName = optionalGetStudentName();
		if(studentName.isPresent()) {
			System.out.println(studentName.get().length());
		}

	}

}

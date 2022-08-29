package optional;

import java.util.Optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

public class OptionalMapFlatMapExmpl {
	
	
	//filter method with optional
	public static void optionalFilter() {
		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		 
		student.filter(st -> st.getGpa()>3.2).ifPresent(st ->System.out.println(st.getGpa()));
	}
	
	//map method with optional
	public static void optionalMap() {
		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<String> mapstudent = student.filter(st -> st.getGpa()>3.2).map(Student::getName);
		System.out.println(mapstudent.get());
	}
	
	//flatmap with optional 
	//we are using flatmap to use optional context under a optional context
	
	public static void flatmapOptional() {
		Optional<Student> student = StudentDataBase.getOptionalStudent();
		Optional<String> mapStudent = student
		.filter(st -> st.getGpa()>=3.5)//Optional<Student Optional<Bike>>
		.flatMap(Student::getBike)//to access the Optional<Bike> inBetween Optional<Student> we have to use flatMap
		.map(Bike::getModel);
		
		System.out.println(mapStudent.get());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flatmapOptional();

	}

}

package optional;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class OptionalOrElseExmpl {
	
	
	//when we have to send some String in return
	  public static String optionalOrElse(){

	        Optional<Student> getOptionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
	       // Optional<Student> optionalStudent = Optional.ofNullable(null);

	        String name =  getOptionalStudent.map(Student::getName).orElse("Default");

	        return name;

	    }

	  //it is expecting a supplier in return
	    public static String optionalOrElseGet(){

	        Optional<Student> getOptionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
	        //Optional<Student> optionalStudent = Optional.ofNullable(null);

	        String name =  getOptionalStudent.map(Student::getName).orElseGet(()->"Default");

	        return name;

	    }

	    //whenever u have to throw some exception if data is not found then to use orElseThrow
	    public static String optionalOrElseThrow(){

	        Optional<Student> getOptionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
	        //Optional<Student> optionalStudent = Optional.ofNullable(null);

	        String name =  getOptionalStudent.map(Student::getName).orElseThrow(()->new RuntimeException("No Data available"));

	        return name;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

	}

}

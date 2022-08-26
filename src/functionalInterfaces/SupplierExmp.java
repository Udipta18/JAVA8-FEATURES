package functionalInterfaces;

import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDataBase;

//SUPPLIER TAKE NO INPUT NUT RETURN AN OUTPUT

public class SupplierExmp {

	static Supplier<List<Student>> supplier1 = () -> StudentDataBase.getAllStudents();
	

	public static void main(String[] args) {
		System.out.println(supplier1.get());
	}
}

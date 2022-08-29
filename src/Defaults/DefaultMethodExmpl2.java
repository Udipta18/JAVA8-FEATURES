package Defaults;
import java.util.*;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;
public class DefaultMethodExmpl2 {
	
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
    static Comparator<Student> genderComparator = Comparator.comparing(Student::getGender);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
    static Consumer<Student> studentConsumer = student -> System.out.println("student : " + student);

    public static void sortByName(List<Student> studentList){

        studentList.sort(Comparator.comparing(Student::getName)); // inline
        studentList.sort(nameComparator); // Using a reference
        System.out.println("After Sort BY Name : ");
        studentList.forEach(studentConsumer);//as foreach take consumer
    }

    public static void sortByGPA(List<Student> studentList){

        studentList.sort(gpaComparator);
        System.out.println("After Sort BY GPA : ");
        studentList.forEach(studentConsumer);
    }

    public static void sortByGender(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        Comparator<Student> nullLast = Comparator.nullsFirst(genderComparator);
        studentList.sort(nullLast);
        System.out.println("After Sort By Gender : ");
        studentList.forEach(studentConsumer);

    }


    public static void comparatorChaining(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        //result will be sort in respect to grade first then the name
        //example of Comparator chaining
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        System.out.println("Comparator Chaining List");
        studentList.forEach(studentConsumer);
    }
    
    
    //this is for handle null values while sorting in list at first or last
    //for last we will use nullLast()
    public static void sortWithNullValues() {
    	List<Student> studentList = StudentDataBase.getAllStudents();
    	Comparator<Student> nullsFirstStudent = Comparator.nullsFirst(nameComparator);
    	studentList.sort(nullsFirstStudent);
    	studentList.forEach(studentConsumer);
    }


	public static void main(String[] args) {
		
		 List<Student> studentList = StudentDataBase.getAllStudents();
	        System.out.println("Original List");
	        studentList.forEach(student -> System.out.println("student : " + student));
	        /*sortByGender();
	        sortByName(studentList);
	        sortByGPA(studentList);*/
	        comparatorChaining();
	}

}

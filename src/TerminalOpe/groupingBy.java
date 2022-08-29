package TerminalOpe;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

import data.Student;
import data.StudentDataBase;

public class groupingBy {
	
	 public  static void customizedGroupingBy(){

	        Map<String,List<Student>> studentMap =  StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(student -> student.getGpa()>= 3.8 ?  "OUTSTANDING" : "AVERAGE"));

	        Stream.of(studentMap).forEach(System.out::println);
	    }
	 
	 public static void groupinBy2() {
		 Map<String, Integer> collect = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student :: getName,
				 Collectors.summingInt(Student::getNoteBooks) ));
	
	      Stream.of(collect).forEach(System.out::println);
	 
	 }
	 
	 public static void findLeastStudentInEachGrade() {
		  Map<String, Student> collect = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName,
				Collectors.collectingAndThen( Collectors.minBy(Comparator.comparingDouble(Student::getGpa)), Optional::get) ));
		  
		  Stream.of(collect).forEach(System.out::println);
	 }
	 
	public static void main(String[] args) {
		//groupinBy2();
		findLeastStudentInEachGrade();
	}
}

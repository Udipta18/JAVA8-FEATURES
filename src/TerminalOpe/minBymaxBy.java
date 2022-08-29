package TerminalOpe;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class minBymaxBy {
	
	
	public static Optional<Student> getStudent(){
		
		 
	  return	StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	
	public static Optional<Student> getStudent2(){
		
		 
		  return	StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
		}
		
	
	
	public static void main(String[] args) {
           System.out.println(getStudent());
           System.out.println(getStudent2());
	}
	
	
}

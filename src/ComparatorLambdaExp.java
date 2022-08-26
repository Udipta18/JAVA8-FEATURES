import java.util.Comparator;

import data.StudentDataBase;

public class ComparatorLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NORMAL WAY TO USE COMPARATOR
		 Comparator<Integer> comp=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				
				
				return o1.compareTo(o2);
			}
			 
		 };
		 
		 
		 System.out.println("comparator-> "+comp.compare(20, 222));
		 
		 
		 Comparator<Integer> comparatorLambda = (Integer  a,Integer b) -> a.compareTo(b);
		    Comparator<Integer> comparatorLambda1 = (a,b) -> a.compareTo(b);

			
			  System.out.println(comparatorLambda.compare(1,2));
			  System.out.println(comparatorLambda1.compare(1,2));
			 
		    
		    
		    
		    
				/*
				 * StudentDataBase.getAllStudents().forEach(st ->{
				 * 
				 * System.out.println(st.getGender()); });
				 */
		}
	
	
	//LAMBDA WAY TO DO THE SAME
	
	
	
}

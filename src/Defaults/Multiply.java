package Defaults;

import java.util.List;

public interface Multiply {
	int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        System.out.println("Inside interface");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){

        return integerList!=null && integerList.size()==0;
    }
    
    
	/*
	 * BASIC DIFF BETWEEN STATIC AND DEFAULT METHOD IS WE CAN'T OVERRIDE STATIC
	 * METHODS IN IMPL CLASS BUT CAN IMPLEMENT IN IMPL CLASS AND METHOD IN CLASS
	 * WILL BE GET INVOKED
	 */
}

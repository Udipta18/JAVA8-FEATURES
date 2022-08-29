package Stream;

import java.util.*;
import java.util.stream.Collectors;

import data.StudentDataBase;

/**
 * 
 *
 */
public class MapExmpl {

	public static List<String> getByName() {
		List<String> list = StudentDataBase.getAllStudents().stream().map(st -> st.getName())
				.map(st -> st.toUpperCase()).collect(Collectors.toList());
		
		return list;
	}
	
	private static Map<String, Integer>  namesLengthMap(ArrayList<String> names){

        Map<String, Integer> namesLengthMap = names.stream()//Stream<String>
                .collect(Collectors.toMap(String::toString,String::length)); // returns Map

        return namesLengthMap;
    }

	public static void main(String[] args) {
		
          ArrayList<String> names=new ArrayList<>();
          names.add("RAM");
          names.add("SHYTAM");
          names.add("CHOMU");

             System.out.println(getByName());
             System.out.println(namesLengthMap(names));
	}
	
	
	
}

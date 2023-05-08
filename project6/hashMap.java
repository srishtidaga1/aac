package project6;
import java.util.*;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> fru =new HashMap<Integer,String>();
		   fru.put(1,"Pineapple");  
		   fru.put(2,"Apple");    
		   fru.put(3,"Banana");   
		   fru.put(4,"Watermelon");   
		       
		   System.out.println("Elements in Hash map : ");  
		   for(Map.Entry m : fru.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue()); 

	}
	}
}



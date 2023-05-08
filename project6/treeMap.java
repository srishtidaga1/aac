package project6;
import java.util.*;
public class treeMap {

	public static void main(String[] args) {
		 TreeMap<Integer,String> mp=new TreeMap<Integer,String>();    
	      mp.put(100,"A");    
	      mp.put(102,"R");    
	      mp.put(101,"V");    
	      mp.put(103,"G");    
	        
	      System.out.println("Elements in TreeMap : ");
	      for(Map.Entry m:mp.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    

	}

}

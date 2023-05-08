package project6;
import java.util.*;
public class hashtableCollection {

	public static void main(String[] args) {
		Hashtable<Integer,String> stu=new Hashtable<Integer,String>();  
		  
		  stu.put(100,"A");  
		  stu.put(102,"B");  
		  stu.put(101,"C");  
		  stu.put(103,"D");  
		  
		  System.out.println("Elements in HashTable : ");
		  for(Map.Entry m:stu.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }

	}

}

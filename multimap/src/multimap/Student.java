package multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Student {
	 public static void main(String[] args)
	 { 
	  
	  Map<String, List<String>> map = new HashMap<String, List<String>>();
	  
	               
	  List<String> cse = new ArrayList<String>();
	  cse.add("harika");
	  cse.add("hema");
	  
	             
	  List<String> ece = new ArrayList<String>();
	  ece.add("dinesh");
	  ece.add("divaker");
	  
	               
	  List<String> ecm = new ArrayList<String>();
	  ecm.add("sarika");
	  ecm.add("cts");
	  
	             
	  map.put("cse", cse);
	  map.put("ece", ece);
	  map.put("ecm", ecm);
	  
	              
	  
	  for (Map.Entry<String, List<String>> entry : map.entrySet())
	  {
	   String key = entry.getKey();
	   List<String> values = entry.getValue();
	   System.out.println("Key = " + key);
	   System.out.println("Values = " + values );
	  }
	 }
	
	}
	



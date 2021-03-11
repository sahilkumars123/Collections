import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Map<Integer, String> mapss = new HashMap<>(); //It will print the output  uniquely but random order
	  Map<Integer, String> linkedhashmaps = new LinkedHashMap<>();//It will print the output  uniquely but in sequential order you have added
	  Map<Integer, String> treeMaps = new TreeMap<>();//It will print the output  uniquely but in sequentially
	  
	  
	  mapss.put(104, "Sahil");
	  mapss.put(103, "Sagar");
	  mapss.put(102, "Rahul");
	  mapss.put(101, "Rakshit");
	  mapss.put(105, "Gaurav");
	  
	  linkedhashmaps.put(102, "Rahul");
	  linkedhashmaps.put(100, "Sahil");
	  linkedhashmaps.put(101, "Sagar");
	  linkedhashmaps.put(103, "Rakshit");
	  linkedhashmaps.put(104, "Gaurav");
	  
	  treeMaps.put(102, "Rahul");
	  treeMaps.put(100, "Sahil");
	  treeMaps.put(101, "Sagar");
	  treeMaps.put(103, "Rakshit");
	  treeMaps.put(104, "Gaurav");
	  
	  
	  
	  for(Map.Entry<Integer, String> temp : mapss.entrySet())
	  {
		  System.out.println("hashMap Key is:: "+ temp.getKey() + "hashMap Value is :: "+temp.getValue());
		  
	  }
	  
	  System.out.println("--------------------------------------------------------------------");
	  
	  for(Map.Entry<Integer, String> temp : linkedhashmaps.entrySet())
	  {
		  System.out.println("Linked HashMap Key is:: "+ temp.getKey() + " Linked HashMap Value is :: "+temp.getValue());
		  
	  }
	  System.out.println("--------------------------------------------------------------------");
	  
	  for(Map.Entry<Integer, String> temp : treeMaps.entrySet())
	  {
		  System.out.println("TreeMap Key is:: "+ temp.getKey() + " TreeMap Value is :: "+temp.getValue()); 
	  }
 
	    

	}

}

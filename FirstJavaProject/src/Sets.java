import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[7];
		
		Set<String> hashset = new HashSet<>();
		Set<String> linkedhashset = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		Set<String> treeSetReverseOrder = new TreeSet<>(Collections.reverseOrder());
		
		str[0] = "Gaurav";
		str[1] = "Saurav";
		str[2] = "Sahil";
		str[3] = "Sagar";
		str[4] = "Gaurav";
		str[5] = "Saurav";
		str[6] = "Ayush";
	
		for(String temp : str)
		{
			hashset.add(temp);
			linkedhashset.add(temp);
			treeSet.add(temp);
			treeSetReverseOrder.add(temp);
		}
		
		System.out.println("Size of an Hashset is "+ hashset.size());// It will print the output  uniquely but random order
		System.out.println("Elements of an Hashset is "+ hashset);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Size of an LinkedHashset is "+ linkedhashset.size()); //It will print the output  uniquely but in sequential order you have added
		System.out.println("Elements of an LinkedHashset is "+ linkedhashset);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Size of an treeset is "+ treeSet.size()); //It will print the output  uniquely but in alphabetically
		System.out.println("Elements of an treeset is "+ treeSet);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Size of an treeHashset is "+ treeSetReverseOrder.size()); //It will print the output  uniquely but in non-sequential manner
		System.out.println("Elements of an treeHashset is "+ treeSetReverseOrder);
	}

}

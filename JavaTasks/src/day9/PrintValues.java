package day9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintValues {

	public static void main(String[] args) {

		Map<Integer,String>	sangar=new HashMap<Integer,String>();
		sangar.put(10, "Java");
		sangar.put(20, "sql");
		sangar.put(30, "oops");
		sangar.put(40, "Sql");
		sangar.put(50, "oracle");
		sangar.put(60, "DB");
		sangar.put(10, "selenium");
		sangar.put(50, "psql");
		sangar.put(40, "Hadoop");
		Collection<String> hashvalues=sangar.values();
		System.out.println("Printing Values hashmap "+hashvalues);

		Map<Integer,String>	sangar1=new LinkedHashMap<Integer,String>();
		sangar1.put(10, "10");
		sangar1.put(20, "20");
		sangar1.put(30, "30");
		sangar1.put(40, "40");
		sangar1.put(50, "50");
		sangar1.put(60, "60");
		sangar1.put(10, "10");
		sangar1.put(50, "50");
		sangar1.put(40, "40");
		Collection<String> linkedvalues=sangar.values();
		System.out.println("Printing Values linked "+linkedvalues);
		
		Map<Character,String>	sangar2=new TreeMap<Character,String>();
		sangar2.put('!', "10");
		sangar2.put('@', "20");
		sangar2.put('#', "30");
		sangar2.put('$', "40");
		sangar2.put('%', "50");
		sangar2.put('^', "60");
		sangar2.put('&', "10");
		sangar2.put('*', "50");
		sangar2.put('(', "40");
		Collection<String> treevalues=sangar2.values();
		System.out.println("Printing Values tree "+treevalues);
		
		Map<String,String>	sangar3=new Hashtable<String,String>();
		sangar3.put("vel", "Selenium");
		sangar3.put("Ganesh", "framework");
		sangar3.put("Dinesh", "oracle");
		sangar3.put("Vengat", "corejava");
		sangar3.put("Subash", "jira");
		Collection<String> tablevalues=sangar3.values();
		System.out.println("Printing Values tree "+tablevalues);
		
		
		
		
		
		
		
		
		
	}

}

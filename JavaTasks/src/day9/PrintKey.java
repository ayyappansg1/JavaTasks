package day9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintKey {

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
		Set<Integer> hashkeys=sangar.keySet();
		System.out.println("Printing Keys "+hashkeys);

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
		Set<Integer> linkkeys=sangar1.keySet();
		System.out.println("Printing Keys only"+linkkeys);
		
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
		Set<Character> treekeys=sangar2.keySet();
		System.out.println("Printing Keys Only"+treekeys);
		
		Map<String,String>	sangar3=new Hashtable<String,String>();
		sangar3.put("vel", "Selenium");
		sangar3.put("Ganesh", "framework");
		sangar3.put("Dinesh", "oracle");
		sangar3.put("Vengat", "corejava");
		sangar3.put("Subash", "jira");
		Set<String> tablekeys=sangar3.keySet();
		System.out.println("Printing Keys Only"+tablekeys);
		
		
		
		
		
		
		
		
		
	}

}

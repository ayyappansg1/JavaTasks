package day9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CreateMaps {
	public static void main(String[] args) {
		
		HashMap<Integer,String> sangar=new HashMap<Integer,String>();
		sangar.put(10, "java");
		sangar.put(20, "sql");
		sangar.put(30, "oops");
		sangar.put(40, "Sql");
		sangar.put(50, "Oracle");
		sangar.put(60, "DB");
		sangar.put(10, "selenium");
		sangar.put(50, "psql");
		sangar.put(40, "Hadoop");
		System.out.println(sangar);
		System.out.println("-------------");
		
		LinkedHashMap<Integer,Integer> sangar1=new LinkedHashMap<Integer,Integer>();
		sangar1.put(10, 10);
		sangar1.put(20, 20);
		sangar1.put(10, 30);
		sangar1.put(40, 40);
		sangar1.put(50, 50);
		sangar1.put(60, 60);
		sangar1.put(10, 50);
		sangar1.put(50, 50);
		sangar1.put(40, 40);
		System.out.println(sangar1);
		
		TreeMap<Character,Integer> sangar2=new TreeMap<Character,Integer>();
		sangar2.put('!', 10);
		sangar2.put('@', 20);
		sangar2.put('#', 30);
		sangar2.put('$', 40);
		sangar2.put('%', 50);
		sangar2.put('^', 60);
		sangar2.put('!', 30);
		sangar2.put('*', 50);
		sangar2.put('(', 40);
		System.out.println(sangar2);
		System.out.println("------------------------");
		Hashtable<String,String> hash=new Hashtable<String,String>();
		hash.put("vel", "java");
		hash.put("Ganesh", "framework");
		hash.put("Dinesh", "oracle");
		hash.put("Vengat", "corejava");
		hash.put("subash", "jira");
		hash.put("subash", "sangar");

		System.out.println(hash);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

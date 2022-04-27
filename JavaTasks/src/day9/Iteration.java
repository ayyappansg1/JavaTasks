package day9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Iteration {
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
		for (Map.Entry<Integer,String> entry : sangar.entrySet()) {
			System.out.println(entry.getKey());
		}
		
		System.out.println("-------------------");
		for (Map.Entry<Integer,String> entry : sangar.entrySet()) {
			System.out.println(entry.getValue());
		}
				
		System.out.println("-------------");
		for (Map.Entry<Integer,String> entry : sangar.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("-----------------------");
		System.out.println("*----------------------*");
		
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
		for(Map.Entry<Integer, Integer> newly:sangar1.entrySet())
		{
			System.out.println(newly.getKey());
		}
		System.out.println("---------------");
		for(Map.Entry<Integer, Integer> new1:sangar1.entrySet())
		{
			System.out.println(new1.getValue());
		}
		System.out.println();
		for(Map.Entry<Integer, Integer> new2:sangar1.entrySet())
		{
			System.out.println(new2.getKey());
			System.out.println(new2.getValue());
		}
		
		System.out.println("----------------------");
		System.out.println("---------------");
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
		for(Map.Entry<Character, Integer> new2:sangar2.entrySet())
		{
			System.out.println(new2.getKey());
		}
		System.out.println("-------------");
		for(Map.Entry<Character, Integer> new3:sangar2.entrySet())
		{
			System.out.println(new3.getValue());
		}
		System.out.println("-----------------");
		for(Map.Entry<Character, Integer> new4:sangar2.entrySet())
		{
			System.out.println(new4.getKey());
			System.out.println(new4.getValue());
		}
		
		System.out.println("----------------------");
		System.out.println("------------------------");
		Hashtable<String,String> hash=new Hashtable<String,String>();
		hash.put("vel", "java");
		hash.put("Ganesh", "framework");
		hash.put("Dinesh", "oracle");
		hash.put("Vengat", "corejava");
		hash.put("subash", "jira");
		hash.put("subash", "sangar");
		for(Map.Entry<String, String> new5:hash.entrySet())
		{
			System.out.println(new5.getKey());
		}
		System.out.println("-------------");
		for(Map.Entry<String, String> new6:hash.entrySet())
		{
			System.out.println(new6.getValue());
		}
		System.out.println("--------------");
		for(Map.Entry<String, String> new7:hash.entrySet())
		{
			System.out.println(new7.getKey());
			System.out.println(new7.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

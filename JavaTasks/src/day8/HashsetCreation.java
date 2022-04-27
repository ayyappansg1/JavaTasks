package day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetCreation {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(105);
		lhs.add(205);
		lhs.add(305);
		lhs.add(405);
		lhs.add(505);
		lhs.add(605);
		lhs.add(705);
		lhs.add(805);

		System.out.println(lhs);
		for(Integer sangar:lhs) {
			System.out.println("Using for Each " +sangar);
					
		}
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		ts.add(90);
		ts.add(10);
		ts.add(20);
		for(Integer sangar1:ts) {
			System.out.println("Using for Each Treeset is " +sangar1);
					
		}
		
		HashSet<Integer> add1=new HashSet<Integer>();
		add1.add(10);
		add1.add(20);
		add1.add(30);
		add1.add(40);
		add1.add(50);
		add1.add(60);
		add1.add(70);
		add1.add(80);
		add1.add(90);
		add1.add(10);
		add1.add(20);
		for(Integer sangar2:add1) {
			System.out.println("Using for Each Hashset " +sangar2);
					
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}

package day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveAll {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(90);
		hs.add(10);
		hs.add(10);
		hs.add(40);
		hs.add(50);

		HashSet<Integer> add1=new HashSet<Integer>();
		add1.add(30);
		add1.add(40);
		add1.add(50);
		add1.add(60);
		add1.add(80);
		add1.removeAll(hs);
		System.out.println("Remaining Values in Newly created Hashset is "+add1);
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(90);
		lhs.add(10);
		lhs.add(10);
		lhs.add(40);
		lhs.add(50);
		
		LinkedHashSet<Integer> add2=new LinkedHashSet<Integer>();
		add2.add(10);
		add2.add(20);
		add2.add(60);
		add2.add(50);
		add2.add(40);
		add2.add(70);
		add2.add(80);
		add2.add(90);
		add2.removeAll(lhs);
		System.out.println("Remaining values in Newly Created Linked Hashset is "+add2);
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		
		TreeSet<Integer> add3=new TreeSet<Integer>();
		add3.add(100);
		add3.add(200);
		add3.add(300);
		add3.add(400);
		add3.add(500);
		add3.add(600);
		add3.add(700);
		add3.add(800);
		add3.removeAll(ts);
		System.out.println("Remaining values in Newly Created Treeset	 is "+add3);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}

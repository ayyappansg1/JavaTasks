package day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class GetEachValue {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(80);
		hs.add(90);
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add(60);
		lhs.add(70);
		lhs.add(80);
		lhs.add(90);
		lhs.add(10);
		lhs.add(20);
		System.out.println(lhs);
		
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
		System.out.println(ts);
		
		HashSet<Integer> add1=new HashSet<Integer>();
		add1.add(10);
		add1.add(20);
		add1.add(30);
		add1.add(90);
		add1.add(10);
		add1.add(10);
		add1.add(40);
		add1.add(50);
		add1.retainAll(hs);
		System.out.println("Common VAlues are "+add1);
		
		LinkedHashSet<Integer> add2=new LinkedHashSet<Integer>();
		add2.add(105);
		add2.add(205);
		add2.add(305);
		add2.add(405);
		add2.add(505);
		add2.add(605);
		add2.add(705);
		add2.add(805);
		add2.add(505);
		add2.add(605);
		add2.addAll(lhs);
		System.out.println(add2);
		
		TreeSet<Integer> add3=new TreeSet<Integer>();
		add3.add(100);
		add3.add(200);
		add3.add(300);
		add3.add(400);
		add3.add(500);
		add3.add(600);
		add3.add(700);
		add3.add(100);
		add3.add(300);
		add3.add(500);
		add3.addAll(ts);
		System.out.println(add3);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}

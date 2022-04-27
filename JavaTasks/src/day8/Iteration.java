package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Iteration {
	public static void main(String[] args) {
		TreeSet<Integer> sangar=new TreeSet<Integer>();
		sangar.add(10);
		sangar.add(20);	
		sangar.add(30);
		sangar.add(40);
		sangar.add(50);
		sangar.add(60);
		sangar.add(70);
		sangar.add(80);
		sangar.add(90);
		sangar.add(10);
		sangar.add(20);
		for (Integer integer : sangar) {
			System.out.println(integer);
		}
		System.out.println("-------------");
		LinkedHashSet<Integer> sangar1=new LinkedHashSet<Integer>();
		sangar1.add(105);
		sangar1.add(205);	
		sangar1.add(305);
		sangar1.add(405);
		sangar1.add(505);
		sangar1.add(605);
		sangar1.add(705);
		sangar1.add(805);
		for (Integer integer1 : sangar1) {
			System.out.println(integer1);
		}
		System.out.println("-------------");
		HashSet<Integer> sangar2=new HashSet<Integer>();
		sangar2.add(10);
		sangar2.add(20);	
		sangar2.add(30);
		sangar2.add(40);
		sangar2.add(50);
		sangar2.add(60);
		sangar2.add(70);
		sangar2.add(80);
		sangar2.add(90);
		sangar2.add(10);
		sangar2.add(20);
		for (Integer integer3 : sangar2) {
			System.out.println(integer3);
		}
	}
}

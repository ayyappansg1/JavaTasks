package day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question1 {
	public static void main(String[] args) {
		
		Set<Integer> sangar=new HashSet<Integer>();
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
		System.out.println(sangar);
		LinkedHashSet<Integer> sangar1=new LinkedHashSet<Integer>();
		sangar1.add(10);
		sangar1.add(20);
		sangar1.add(30);
		sangar1.add(40);
		sangar1.add(50);
		sangar1.add(60);
		sangar1.add(70);
		sangar1.add(80);
		sangar1.add(90);
		sangar1.add(10);
		sangar1.add(20);
		System.out.println(sangar1);
		TreeSet<Integer> sangar2=new TreeSet<Integer>();
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
		System.out.println(sangar2);
		
		
		
		
		
	}

}

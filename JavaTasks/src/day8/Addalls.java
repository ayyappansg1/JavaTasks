package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Addalls {
	public static void main(String[] args) {
		
		List<Integer> sangar=new ArrayList<Integer>();
		sangar.add(10);
		sangar.add(20);	
		sangar.add(30);
		sangar.add(90);
		sangar.add(10);
		sangar.add(10);
		sangar.add(40);
		sangar.add(50);
		HashSet<Integer> convert=new HashSet<Integer>();
		convert.addAll(sangar);
		System.out.println(convert);
		System.out.println("-------------");
		List<Integer> sangar1=new ArrayList<Integer>();
		sangar1.add(105);
		sangar1.add(205);	
		sangar1.add(305);
		sangar1.add(405);
		sangar1.add(505);
		sangar1.add(605);
		sangar1.add(705);
		sangar1.add(805);
		sangar1.add(505);
		sangar1.add(605);
		LinkedHashSet<Integer> convert1=new LinkedHashSet<Integer>();
		convert1.addAll(sangar1);
		System.out.println(sangar1);
		System.out.println("-------------------");
		List<Integer> sangar2=new ArrayList<Integer>();
		sangar2.add(100);
		sangar2.add(200);	
		sangar2.add(300);
		sangar2.add(400);
		sangar2.add(500);
		sangar2.add(600);
		sangar2.add(700);
		sangar2.add(100);
		sangar2.add(300);
		sangar2.add(500);
		TreeSet<Integer> convert2=new TreeSet<Integer>();
		convert2.addAll(sangar2);
		System.out.println(convert2);
		
		
		
		
		
	}

}

package day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RempoveAll {
	public static void main(String[] args) {
		
		HashSet<Integer> sangar=new HashSet<Integer>();
		sangar.add(10);
		sangar.add(20);
		sangar.add(30);
		sangar.add(90);
		sangar.add(10);
		sangar.add(10);
		sangar.add(40);
		sangar.add(50);
		System.out.println(sangar);
		
		HashSet<Integer> dude=new HashSet<Integer>();
		dude.add(30);
		dude.add(40);
		dude.add(50);
		dude.add(60);
		dude.add(80);
		dude.removeAll(sangar);
		System.out.println("Removed Values Are below");
		System.out.println(dude);
		System.out.println("-----------------");
		LinkedHashSet<Integer> sangar1=new LinkedHashSet<Integer>();
		sangar1.add(10);
		sangar1.add(20);
		sangar1.add(30);
		sangar1.add(90);
		sangar1.add(10);
		sangar1.add(10);
		sangar1.add(40);
		sangar1.add(50);
		System.out.println(sangar1);
		
		LinkedHashSet<Integer> dude1=new LinkedHashSet<Integer>();
		dude1.add(10);
		dude1.add(20);
		dude1.add(60);
		dude1.add(50);
		dude1.add(40);
		dude1.add(70);
		dude1.add(80);
		dude1.add(90);
		dude1.removeAll(sangar1);
		System.out.println("Removed values are");
		System.out.println(dude1);
		System.out.println("------------");
		
		TreeSet<Integer> sangar2=new TreeSet<Integer>();
		sangar2.add(10);
		sangar2.add(20);
		sangar2.add(30);
		sangar2.add(40);
		sangar2.add(50);
		sangar2.add(60);
		sangar2.add(70);
		sangar2.add(80);
		System.out.println(sangar2);
		
		TreeSet<Integer> dude2=new TreeSet<Integer>();
		dude2.add(100);
		dude2.add(200);
		dude2.add(300);
		dude2.add(400);
		dude2.add(500);
		dude2.add(600);
		dude2.add(700);
		dude2.add(800);
		dude2.removeAll(sangar2);
		System.out.println("Removed values are ");
		System.out.println(dude2);
		System.out.println("-------------------");
		
		
		
		
		
	}

}

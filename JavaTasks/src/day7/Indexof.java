package day7;

import java.util.LinkedList;

public class Indexof {

	public static void main(String[] args) {
		
	LinkedList<Integer> sang=new LinkedList<Integer>();
	sang.add(10);
	sang.add(20);
	sang.add(30);
	sang.add(90);
	//System.out.println(sang.indexOf(10));
	
	LinkedList<Integer> sang2=new LinkedList<Integer>();
	sang2.addAll(sang);
	sang2.add(10);
	sang2.add(10);
	sang2.add(40);
	sang2.add(50);
	//System.out.println(sang2.lastIndexOf(10));
	//System.out.println(sang2.indexOf(10));
	
	
	
	}

}

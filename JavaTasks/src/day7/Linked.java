package day7;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Linked {
	public static void main(String[] args) {
		
		LinkedList<Integer> san=new LinkedList<Integer>();
		san.add(100);
		san.add(200);
		san.add(300);
		san.add(400);
		san.add(500);
		san.add(600);
		san.add(700);
		System.out.println(san.size());
		
		LinkedList<Integer> san2=new LinkedList<Integer>();
		san2.addAll(san);
		System.out.println(san2.size());
		for(int sang:san2) {
			System.out.println("Using Each"+sang);
		}for(int i=0;i<san2.size();i++) {
			System.out.println("Using Sangar"+san2.get(i));
		}
		
		ListIterator<Integer> san3=san2.listIterator();
		while(san3.hasNext()) {
			System.out.println(san3.next());
		}while(san3.hasPrevious()) {
			System.out.println(san3.previous());
		}
		
		
		
		
		
		
		
		
		
	}

}

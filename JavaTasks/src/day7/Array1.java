package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Array1 {

	public static void main(String[] args) {
		
		List <Integer> sang=new ArrayList<Integer>();
		sang.add(10);
		sang.add(20);
		sang.add(30);
		sang.add(90);
		sang.add(10);
		sang.add(10);
		sang.add(40);
		sang.add(50);
		sang.remove(1);
		
		System.out.println(sang.size());
		for(int son:sang) {
			System.out.println("Using Each "+son);
		}
		for(int i=0;i<sang.size();i++) {
			System.out.println("Using Loop "+sang.get(i));
		}
		
		ListIterator san2=sang.listIterator();

		while(san2.hasNext()) {
			System.out.println(san2.next());
		}
		while(san2.hasPrevious()) {
			System.out.println(san2.previous());
		}
		
		
		
		
	}
}

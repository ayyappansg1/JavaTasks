package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx{

	public static void main(String[] args) {
		
		List<Integer> sang=new ArrayList<Integer>();
		sang.add(10);
		sang.add(10);
		sang.add(20);
		sang.add(50);
		sang.add(60);
		sang.add(80);
		sang.add(60);
		sang.add(50);
		System.out.println(sang);
		sang.remove(0);
		sang.remove(6);
		sang.remove(5);
		System.out.println(sang);
		for(int sang1:sang) {
			System.out.println("Using Each"+sang1);
		}
		for(int i=0;i<sang.size();i++) {
			System.out.println("Using sangar"+sang.get(i));
		}
		
		ListIterator<Integer> sang2=sang.listIterator();
		while(sang2.hasNext()) {
			System.out.println(sang2.next());
		}while(sang2.hasPrevious()) {
			System.out.println(sang2.previous());
		}
		
		
		
		
		
		
		
		
	}
}

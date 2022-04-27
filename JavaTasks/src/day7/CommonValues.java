package day7;

import java.util.ArrayList;
import java.util.List;

public class CommonValues {
	
	public static void main(String[] args) {
		
		List<Integer> sang=new ArrayList<Integer>();
		sang.add(10);
		sang.add(20);
		sang.add(30);
		sang.add(90);
		sang.add(10);
		sang.add(10);
		sang.add(40);
		sang.add(50);

		List<Integer> sang2=new ArrayList<Integer>();
		sang2.add(30);
		sang2.add(40);
		sang2.add(60);
		sang2.add(80);
			
		System.out.println("-------------");
		sang.removeAll(sang2);
		System.out.println(sang);
		System.out.println("---------------");
		//sang.retainAll(sang2);
		//System.out.println(sang);
		List<Integer> sang3=new ArrayList<Integer>();
		sang3.add(10);
		sang3.add(20);
		sang3.add(30);
		sang3.add(90);
		sang3.add(10);
		sang3.add(10);
		sang3.add(40);
		sang3.add(50);
		
		List<Integer> sang4=new ArrayList<Integer>();
		sang4.add(10);
		sang4.add(20);
		sang4.add(60);
		sang4.add(50);
		sang4.add(40);
		sang4.add(70);
		sang4.add(80);
		sang4.add(90);
		sang4.removeAll(sang3);
		System.out.println(sang4);
		
		List<Integer> sang5=new ArrayList<Integer>();
		sang5.add(10);
		sang5.add(20);
		sang5.add(30);
		sang5.add(40);
		sang5.add(50);
		sang5.add(60);
		sang5.add(70);
		sang5.add(80);
		
		List<Integer> sang6=new ArrayList<Integer>();
		sang6.add(100);
		sang6.add(200);
		sang6.add(300);
		sang6.add(400);
		sang6.add(500);
		sang6.add(600);
		sang6.add(700);
		sang6.add(800);
		sang6.removeAll(sang5);
		System.out.println(sang6);
		
	}

}
	
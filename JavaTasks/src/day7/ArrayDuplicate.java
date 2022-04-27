package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayDuplicate {
	
	public static void main(String[] args) {
		int sangar[]=new int[8];
		sangar[0]=10;
		sangar[1]=10;
		sangar[2]=20;
		sangar[3]=50;
		sangar[4]=60;
		sangar[5]=80;
		sangar[6]=60;
		sangar[7]=50;

		List<Integer> newly=new ArrayList<Integer>();
		for(int i=0;i<sangar.length;i++)
		{
			newly.add(sangar[i]);
		}
		System.out.println(newly);
		Set<Integer>  setted=new LinkedHashSet<Integer>();
		setted.addAll(newly);
		System.out.println(setted);
		
		
	}

}

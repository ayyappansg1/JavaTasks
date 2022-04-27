package day7;

import java.util.LinkedHashSet;

public class SumArray {

	public void sangararray() {
		int in[]=new int[8];
		in[0]=10;
		in[1]=10;
		in[2]=20;
		in[3]=50;
		in[4]=60;
		in[5]=80;
		in[6]=60;
		in[7]=50;
		LinkedHashSet<Integer> sangar=new LinkedHashSet<Integer>();
		for(int i=0;i<in.length;i++) {
		sangar.add(in[i]);
		}
		System.out.println(sangar);

	}
		public static void main(String[] args) {
			SumArray newly=new SumArray();
			
			newly.sangararray();
			
			

		}

}

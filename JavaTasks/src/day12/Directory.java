package day12;

import java.io.File;

public class Directory {

	public static void main(String[] args) {
		
		File files=new File("E:\\jars");
			
		String[] list = files.list();
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
	}

}

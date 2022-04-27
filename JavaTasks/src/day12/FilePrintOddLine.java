package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FilePrintOddLine {
	public static void main(String[] args) throws IOException {
		String filename="E:\\Fileoperations\\10line.txt";
		
		File file=new File(filename);
		Scanner scanner=new Scanner(file);

		List<String> sangar=new LinkedList<String>();
		
		while(scanner.hasNextLine())
		{
			sangar.add(scanner.nextLine());
		} 
		System.out.println(sangar);

		
		for(int i=0;i<sangar.size();i++) {
			if(i%2!=0) {
			System.out.println(sangar.get(i));
		}
		}
		}
	}

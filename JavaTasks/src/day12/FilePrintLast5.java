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

public class FilePrintLast5 {
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

		
		for(int i=(sangar.size()-1);i>(sangar.size()-6);i--) {
			System.out.println(sangar.get(i));
		}
		}
	}

package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileDuplicateValues {
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
		int duplicate=0;
		for(int i=0;i<sangar.size();i++)
		{
			for (int j = i+1; j <sangar.size(); j++)
			{
				
				if(sangar.get(i).equals(sangar.get(j)))
				{
					duplicate++;
					System.out.println(duplicate);
				}
			}
		}
		}
	}

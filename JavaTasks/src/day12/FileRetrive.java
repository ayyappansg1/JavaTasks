package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRetrive {
	public static void main(String[] args) throws IOException {
		String filename="E:\\Fileoperations\\10line.txt";
		
		File file=new File(filename);
		FileReader filereader=new FileReader(file);
		BufferedReader buffer=new BufferedReader(filereader);
		int num=0;
		while(buffer.readLine()!=null)
		{
			num++;
		}
		System.out.println("Row count is ");
		System.out.println(num);

		}

}
	
	

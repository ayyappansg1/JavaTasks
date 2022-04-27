package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewFileCreate {
	public static void main(String[] args) throws IOException {
		String filename="E:\\Fileoperations\\10line.txt";
		List<String> content=new ArrayList<String>();
		content.add("First Line");
		content.add("Second Line");
		content.add("Third Line");
		content.add("Fourth Line");
		content.add("Fifth Line");
		content.add("Sixth Line");
		content.add("Seventh Line");
		content.add("Eightth Line");
		content.add("java palani");
		content.add("Tenth Line");
		content.add("Eleventh line");
		content.add("First Line");

		File file=new File(filename);

		FileWriter filewriter=new FileWriter(file);
		BufferedWriter buffer=new BufferedWriter(filewriter);
		for (String string : content) {
			buffer.write(string);
			buffer.newLine();

		}
		buffer.close();







	}
}

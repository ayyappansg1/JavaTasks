package day6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValid {
	Scanner sangar=new Scanner(System.in);
	String input=sangar.next();

	public void sangar1() {
	
		Pattern p=Pattern.compile("^\\d{10}$");
		
		Matcher m=p.matcher(input);
		
		if(m.matches()) {
			System.out.println(" Valid number ");
		}else {
			System.out.println("Not a Valid ");
		}
			
	}
	
	public static void main(String[] args) {
		
		PhoneValid get=new PhoneValid();
		get.sangar1();
		
		
		/*if(dude==10) {
			System.out.println(dude+" is a Valid Number");
		}else {
			System.out.println(dude+" is Not a Valid Number");
		}*/
	}

}

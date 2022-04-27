package day6;

import java.util.Scanner;

public class PhoneNum {

	public static void main(String[] args) {
		Scanner sangar=new Scanner(System.in);
		String number1=sangar.next();			
		if(number1.matches("^[a-z]*$") && number1.length()==10)
		{
			System.out.println(number1+ " Number is Valid");
		}else {
			System.out.println(number1+ " Number is not Valid");
		}
		
		


	}
}
package day6;

import java.util.Scanner;

public class EqualIG {

	public static void main(String[] args) {

		Scanner input1=new Scanner(System.in);
		System.out.println("Enter your first input");
		String inputreturn = input1.next();
		
		Scanner input2=new Scanner(System.in);
		System.out.println("Enter your second input");
		String input2return=input2.next();
		
		boolean equality=input2return.equals(inputreturn);
		if(equality) {
			System.out.println("Both are Equal ");
		}else {
			System.out.println("Both are not equal ");
		}
		
		
		
		
		
		
		
		
	}
}

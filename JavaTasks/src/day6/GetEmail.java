package day6;

import java.util.Scanner;

public class GetEmail {

	public static void main(String[] args) {
		Scanner sangar=new Scanner(System.in);
		String email=sangar.next();
		System.out.println(email.contains("@"));
		if(email.contains("@")) {
			System.out.println(email+" Valid Email Address");
		}else {
		System.out.println(email+ " Not a Valid Email Address"); 
	}
	}
}

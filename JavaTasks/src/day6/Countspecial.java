package day6;

public class Countspecial {

	
	public static void main(String[] args) {

		String name="Welcome To Java class @123";
		int upper=0,lower=0,num=0,special=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				upper++;
			}
			else if(ch>='a'&&ch<='z') {
				lower++;
			}
			else if(ch>='0' && ch<='9') {
				num++;
			}else {
				special++;
			}
		}
		System.out.println("Count of UpperCase is "+upper);
		System.out.println("Count of LowerCase is "+lower);
		System.out.println("Count of Numbers is "+num);
		System.out.println("count of Special characters are "+special);
		
		
		
		
	}
}

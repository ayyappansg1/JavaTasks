package day6;

public class Vowels {

	
	public static void main(String[] args) {

		String name="Welcome";
		int vowels=0,consonent=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch == 'a'|| ch=='A') {
				vowels++;
			}
			else if(ch=='e' || ch=='E') {
				vowels++;
			}
			else if(ch=='i' || ch=='I') {
				vowels++;
			}else if(ch=='o' || ch=='O'){
				vowels++;
			}else if(ch=='u' || ch=='U') {
				vowels++;
			}else {
				consonent++;
			}
		}
		System.out.println("Count of Consonent is "+consonent);
		System.out.println("Count of Vowels is "+vowels);
		
		
	}		
}

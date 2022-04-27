package day6;

public class VowelsReplace {

	public static void main(String[] args) {
	String name="Welcome";
	char ch[]=name.toCharArray();
	for(int i=0;i<name.length();i++)
	{
		if(ch[i] == 'a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			ch[i]='@';
		}
	}
	for(int i=0;i<name.length();i++) {
			System.out.print(ch[i]);
		}
		
	
	
}
}

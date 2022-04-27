package day2;

public class LanguageClass extends English{

	public void allLanguage() {
		System.out.println("All languages shown here");
	}
	public static void main(String[] args) {
		LanguageClass sangar=new LanguageClass();
		sangar.allLanguage();
		sangar.tamilLanguage();
		sangar.telguLanguage();
		sangar.englishLanguage();
	}
	
	
	
}

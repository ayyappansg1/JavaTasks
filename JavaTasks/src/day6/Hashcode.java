package day6;

public class Hashcode {
	
	
	public static void main(String[] args) {
		
		String name="Nisha";
		String name1="Nisha";

		int sangar=System.identityHashCode(name);
		System.out.println(sangar);
		int sangar1=System.identityHashCode(name1);
		System.out.println(sangar1);
		
		String name2=new String("Nisha");
		int sangar2=System.identityHashCode(name2);
		String name3=new String("Nisha");
		int sangar3=System.identityHashCode(name3);
		System.out.println(sangar2);
		System.out.println(sangar3);
		
		String name4=new String("Nisha");
		int sangar4=System.identityHashCode(name4);
		String name5=new String("Rengan");
		int sangar5=System.identityHashCode(name5);
		String name6=new String("NishaRengan");
		int sangar6=System.identityHashCode(name6);
		System.out.println(sangar4);
		System.out.println(sangar5);
		System.out.println(sangar6);

		String name7="Nisha";
		String name8="Rengan";
		String name9="NishaRengan";

		int sangar7=System.identityHashCode(name7);
		System.out.println(sangar7);
		int sangar8=System.identityHashCode(name8);
		System.out.println(sangar8);
		int sangar9=System.identityHashCode(name9);
		System.out.println(sangar9);
		
		
		
		
		
	}

}

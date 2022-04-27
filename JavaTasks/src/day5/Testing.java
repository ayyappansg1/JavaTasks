package day5;

public class Testing {

	static String name;
	static int age;
	static float salary;
	static char marital;
	String surname;
	Testing(){
		System.out.println("Nothing inside");
	}
	Testing(String name){
		this.name="naming";
		System.out.println("IT is different "+name);
	}
	Testing(int age,int id){
		System.out.println("Age is "+age+" ID is "+id);
	}
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	System.out.println(marital);
	Testing sang=new Testing();
	Testing sang2=new Testing("Dude");	
	Testing sang3=new Testing(25, 8204);
	}
	
	
}

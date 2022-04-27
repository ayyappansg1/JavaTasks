package day5;

public class A{
	  public A() {
		  this(12);
	    System.out.println("Default const...");
	  }
	  public A(int id) {
		  System.out.println(id);
	  }

	  public static void main(String[] args) {
	    A a = new A();
	  }

	}



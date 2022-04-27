package tst;

public class SingletonClass {
	static SingletonClass des;
	//to avoid object creation in another classes
	private SingletonClass() {
		System.out.println("We cant create object in another");
	}
	public static SingletonClass sangar() {
		if(des==null) {
			des=new SingletonClass();
		}
		return des;
		
		
	}

	public static void main(String[] args) {
		
		SingletonClass sm=sangar();
		System.out.println(System.identityHashCode(sm));
		SingletonClass sm1=sangar();
		System.out.println(System.identityHashCode(sm1));
		
		
	}

}

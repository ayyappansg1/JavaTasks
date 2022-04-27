package tst;

public class BeforeSingletonClass2 {

	public int sangar(int a,int b) {
		int c=a+b;
		return b;
	}
	public static void main(String[] args) {
		BeforeSingletonClass2 s=new BeforeSingletonClass2();
		int sangardude = s.sangar(30, 40);
		System.out.println(sangardude);
		
	}

}

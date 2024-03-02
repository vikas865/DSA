package Threading;

class A{
	
	void show() {
		System.out.println("A");
	}
	
}

class B extends A{
	
	void show() {
		System.out.println("B");
	}
}



public class FinalClass {
	
	
	public static void main(String[] args) {
		
		A a= new B();
		
		a.show();
		
	}
	


}

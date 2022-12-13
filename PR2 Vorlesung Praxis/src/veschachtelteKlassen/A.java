package veschachtelteKlassen;

public class A {

	public static void main(String[] args) {
        new A().new B();
        
        A a= new A();//instantiierung
        B b = a.new B();//instantiierung
        
	}

	
	private class B{
		
	}
	
}

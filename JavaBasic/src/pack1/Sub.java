package pack1;

public class Sub extends AbstractionDemo {

	public static void main(String[] args) {
		
		Sub obj = new Sub();
		obj.m5();
		obj.m3();
	}

	public void m5() {
		System.out.println("Child Class Method");
	}

	@Override
	public void m4() {
		// different implementation as the parent
		
	}
	
/*	public void m6() {
		System.out.println("Final of parent");
	}
*/
	
	public static void m3() {
		System.out.println("Static method of child");
	}
}

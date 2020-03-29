package pack1;

public class Poly2 extends Poly1 {
	
	public static void main(String[] args) {
		
		Poly1 obj = new Poly2();
		obj.add(23);
		obj.add();
	}
	
	public void add(int a) {
		
		// Overriding Method
		System.out.println("Overriding Method");	
	}
	
	public void add() {
		// Overriding can be choose when user need to execute a functionality with different implementations.
	}
}

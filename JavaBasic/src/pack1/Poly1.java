package pack1;

public class Poly1 {

	String result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public final void add(String a) {
		
	}
	
	public void add(int a) {
		// Overridden Method
		System.out.println("Overridden Method");
	}
	
	protected static void add(char c) {
		System.out.println("Parent");
	}
	public void add() {
		
	}
	public String add(String c, int d) {
		return this.result;
	}
	
	public void add(int a, int b) {
		// Overloading can be choose when user need to execute a functionality with different types of data
	}
}

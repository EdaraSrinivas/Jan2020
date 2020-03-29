package pack1;

public class Test4 {

	public static void main(String[] args) {
		
		Test4 object = new Test4(); // Object
		object.addition();
		
		object.subtraction();
	}

	public void addition() {
		// Adding numbers
		int a = 45;
		int b = 23;
		int result = a + b;
		System.out.println(result);
	}

	public void subtraction() {
		// Subtraction
		int c = 56;
		int d = 87;
		int result1 = c - d;
		System.out.println("Sub:" + result1);
	}

}

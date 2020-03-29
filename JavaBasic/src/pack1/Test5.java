package pack1;

public class Test5 {

	public static void main(String[] args) {
		
		Test5 object = new Test5(); // Object
		int c = object.addition(23, 45);
		System.out.println(c);
		int d = object.addition(34, 12);
		System.out.println(d);
	}

	public int addition(int a, int b) {
		// Adding numbers
		int result = a + b;
	//	System.out.println("Add:" + result);
		return result;
	}

	public void subtraction(int c, int d) {
		// Subtraction
		int result1 = c - d;
		System.out.println("Sub:" + result1);
	}

}

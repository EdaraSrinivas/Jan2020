package pack1;

public class Test6 {

	public static void main(String[] args) {
		
		Test6 object = new Test6(); // Object
	//	System.out.println(object.addition());
		
		int value = object.addition();
		System.out.println("Add:"+value);
		
		object.subtraction();
		object.mul();
		object.div();
	}

	public int addition() {
		// Adding numbers
		int a = 45;
		int b = 23;
		int result = a + b;
		return result;
	}

	public void subtraction() {
		// Subtraction
		int c = 56;
		int d = 87;
		int result1 = c - d;
		System.out.println("Sub:" + result1);
	}
	
	private void mul() {
		System.out.println("Mul");
	}
	
	protected void div() {
		System.out.println("Div");
	}
	
	void m1() {
		System.out.println("M1");
	}

}

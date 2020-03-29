package pack1;

public class ObjectDemo {

	int b;
	double d;
	
	public static void main(String[] args) {

		// variable - reference of data
		//int a = 45;	
		
		// Object - Reference of class
	//	ObjectDemo demo = new ObjectDemo(23, 12.2);
		ObjectDemo demo = new ObjectDemo(34, 23.12);
		
		demo.add();
		demo.sub();
	}
	
	public ObjectDemo(int b, double d) {
		
		this.b = b;
		this.d = d;
	}
	
	public ObjectDemo() {
		
	}
	
	public void add() {
		
	}
	private void sub() {
		double e = b-d;
		System.out.println("Sub:"+e);
	}

}

package pack1;

public class Inherit2 extends Inherit1 {

	int d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inherit2 obj = new Inherit2();
		obj.m1();
		obj.m3();
		
		Inherit1 obj2 = new Inherit2();
		obj2.m1();
	}
	public void m3() {
		System.out.println("M3");
	}
	
}

package testng;

public class Sample {

	public static void main(String[] args) {
		
		m1(23);
		m1(0);
	}
	
	public static void m1(int a) {
		System.out.println(a);
	}
	public static void m2(int a, String b) {
		System.out.println(a+","+b);
	}
	public static void m3(char c) {
		System.out.println(c);
	}

}

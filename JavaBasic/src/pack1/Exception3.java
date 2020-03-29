package pack1;

public class Exception3 {

	public static void main(String[] args) {
		m1();
	}
	
	public static void m1() {
		System.out.println("Userdefined Exception");
		try {
			throw new MyException("Error Message");
		} catch (MyException e) {
			
			e.printStackTrace();
		}
	}

}

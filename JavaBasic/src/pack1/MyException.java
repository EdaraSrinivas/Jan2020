package pack1;

public class MyException extends Exception {

	String str1;
	
	public MyException(String str2) {
		str1 = str2;
	}
	
	public String toString() {
		return ("Exception in Thread Main:MyException -- "+str1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package pack1;

import java.util.Scanner;

public class Test7 {
	
	int a,b,c,d;
	
	public static void main(String[] args) {
		
		Test7 object = new Test7(); // Object
		
	}

	public void addition() {
		// Adding numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Value:");
		this.a = sc.nextInt();
		System.out.println("Enter B Value:");
		this.b = sc.nextInt();
		sc.close();
		
		int result = a+b;
		System.out.println("Add:"+result);
	}

	
}

package pack1;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		Exception1 obj = new Exception1();
		obj.m1();
	
	}
	
	public void m1() throws FileNotFoundException, InterruptedException {
		
		FileInputStream f = new FileInputStream("");
		int a = 23;
		int b = 45;
		Thread.sleep(3000);
		int c = a+b;
		System.out.println(c);
	}
	
	public void m2() throws Exception {
		
		FileInputStream f = new FileInputStream("");
		int a = 23;
		int b = 45;
		Thread.sleep(3000);
		int c = a+b;
		System.out.println(c);
	}
	
	public void m3() throws FileNotFoundException, InterruptedException {
		
		m1();
		
	}
	
	public void m4() {
		
		try {
			m1();
		}
		catch(Exception e) {
			// Staements which are to handle the exception given by the try block
		}	
	}
	
	public void m5() {
		
		try {
			m1();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(InterruptedException r) {
			
		}
	}
	public void m6() {
		
		try {
			
		}
		catch(Exception t) {
			
		}
		finally {
			
		}
	}
	
	
	
	
	
	
	
	
}

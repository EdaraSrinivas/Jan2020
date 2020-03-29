package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	
  @Test(enabled=false,invocationCount=6)
  public void f() {
	  System.out.println("Test");
  }
  
  @Parameters({"x","y"})
  @Test
  public void add(int a, int b) {
	  int result = a+b;
	  System.out.println(result);
  }
  
}

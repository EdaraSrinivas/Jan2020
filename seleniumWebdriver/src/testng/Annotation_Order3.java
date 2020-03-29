package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation_Order3 {
  @Test
  public void f() {
	  System.out.println("Test Annotation");
  }
  
  @Test
  public void m1() {
	  System.out.println("Test Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

}

package testng;

import org.testng.annotations.Test;

public class Sample1 {
  @Test(groups= {"Smoke"})
  public void m1() {
	  System.out.println("M1");
  }
  @Test
  public void m2() {
	  System.out.println("M2");
  }
  @Test
  public void m3() {
	  System.out.println("M3");
  }
  @Test(groups= {"Smoke","Sanity"})
  public void m4() {
	  System.out.println("M4");
  }
  @Test
  public void m5() {
	  System.out.println("M5");
  }
  @Test
  public void m6() {
	  System.out.println("M6");
  }
}

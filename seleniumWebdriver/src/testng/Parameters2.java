package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Parameters2 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n+","+s);
  }
  
  @Test(dataProvider="login")
  public void f1(String a, String c) {
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
    };
  }
  
  @DataProvider(name="login")
  public String[][] val() {
    return new String[][] {
      new String[] { "abc", "d" },
    };
  }
  
  
  
}

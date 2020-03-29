package testng;

import org.testng.annotations.Test;

public class Test2 {
	
  @Test(priority=11)
  public void login() {
	  System.out.println("login");
  }
  @Test(priority=10)
  public void registration() {
	  System.out.println("registration");
  }
  @Test(priority=13)
  public void logout() {
	  System.out.println("logout");
  }
  @Test(priority=12)
  public void inbox() {
	  System.out.println("inbox");
  }

  
}

package testng;

import org.testng.annotations.Test;

public class Test4 {
	
  @Test(dependsOnMethods= {"registration"})
  public void login() {
	  System.out.println("login");
  }
  @Test(timeOut=4000)
  public void registration() {
	  System.out.println("registration");
  }
  @Test(dependsOnMethods= {"inbox"})
  public void logout() {
	  System.out.println("logout");
  }
  @Test(dependsOnMethods= {"login"})
  public void inbox() {
	  System.out.println("inbox");
  }

  
    
}

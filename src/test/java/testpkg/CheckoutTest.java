package testpkg;

import org.testng.annotations.Test;

import basepkg.Base_class;

public class CheckoutTest extends Base_class
{
	
	
	@Test(priority=1)
	public void loginvalidation_mthd()
	{
		loginobj.loginmthd("standard_user", "secret_sauce");
		
	}
	 @Test(priority=2)
	  public void cart_methd()
		{
		  checkoutobj.cartmthd_check();
		}  
	 
	 @Test(priority=3)
	 public void checkclick()
	 {
		 checkoutobj.checkoutmethod();
	 }
	 
	 @Test(priority=4)
	  public void checkdetails_mthd() throws Exception
		{
		 Thread.sleep(2000);
		  checkoutobj.checkoutdetails_mthd("priya","ravi","1234");
		}
	 
	 @Test(priority=5)
	 public void continumthd() throws Exception
	 {
		 Thread.sleep(2000);

		 checkoutobj.continue_mthd();
	 }
	}

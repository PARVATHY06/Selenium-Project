package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Base_class;

public class Hometest extends Base_class
{
	@Test(priority=1)
	public void textverify()
	{
		loginobj.loginmthd("standard_user", "secret_sauce"); //calling the loginmethod before executing homepage methods
		String product_text=homeobj.text_mthd();
		Assert.assertEquals(product_text, "Products");  
	}
	
	@Test(priority=2)
	public void linkverify()
	{
		int linkcount=homeobj.linkcount_mthd();
		System.out.println("number of links---" +linkcount);
	}
	
	@Test(priority=3)
	public void cart_mthd()
	{
		homeobj.cartbtn_mthd();
	}

}

package testpkg;

import org.testng.annotations.Test;

import basepkg.Base_class;

public class Paymenttest extends Base_class
{
	@Test(priority=1)
	public void screenshot_verify() throws Exception
	{
		paymentobj.screenshot_metod();
	}
	
	@Test(priority=2)
	public void finish_verification()
	{
		paymentobj.finish_method();
	}

}

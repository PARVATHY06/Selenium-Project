package testpkg;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Base_class;

public class LoginTest extends Base_class
{
	
	@Test(priority=1)
	public void titleverification_mthd()
	{
		String actual_title=loginobj.titlemthd();
		Assert.assertEquals(actual_title,"Swag Labs");
	}
	
	@Test(priority=2)
	public void loginvalidation_mthd()
	{
		loginobj.loginmthd("standard_user", "secret_sauce");
	}
	
	@Test(priority=3)
	public void urlvalidation_mthd()
	{
		String Home_url=loginobj.url_mthd();
		 System.out.println(Home_url);
//		 Assert.assertEquals(Home_url, "https://www.saucedemo.com/inventory.html");
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}

}

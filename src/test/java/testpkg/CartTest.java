package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Base_class;

public class CartTest extends Base_class
{
  @Test(priority=1)
  public void txt_verify()
  {
		loginobj.loginmthd("standard_user", "secret_sauce"); 
	  String yourcart_txt=cartobj.txt_mthd();
	  Assert.assertEquals(yourcart_txt, "Your Cart");
  }
  
  @Test(priority=2)
  public void cart_mthd()
	{
	  cartobj.cart_icon_mthd();
	}

}

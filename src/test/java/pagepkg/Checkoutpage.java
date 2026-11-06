package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement addcart;
	@FindBy(xpath="//*[@id=\"checkout\"]")WebElement checkoutbtn;
//	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement yourinf;
	@FindBy(xpath="//*[@id=\"first-name\"]")WebElement firstname;
	@FindBy(xpath="//*[@id=\"last-name\"]")WebElement lastname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")WebElement postalcode;
	@FindBy(xpath="//*[@id=\"continue\"]")WebElement continuebtn;
	

	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	
	public void cartmthd_check()
	{
		addcart.click();
	}
	
	public void checkoutmethod()
	{
		checkoutbtn.click();
	}
	public void checkoutdetails_mthd(String fn,String ln,String pc) throws Exception
	{
		Thread.sleep(2000);

		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		postalcode.sendKeys(pc);
		
	}
	public void continue_mthd()
	{
		continuebtn.click();

	}

}

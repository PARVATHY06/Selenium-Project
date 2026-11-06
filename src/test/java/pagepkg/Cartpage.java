package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement cartbtn;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement  yourcart;
	
	
    public Cartpage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
		 
	}
    
    public void cart_icon_mthd()
    {
    	cartbtn.click();
    }
    
    public String txt_mthd()
    {
    	String actl_txt=yourcart.getText();
    	return actl_txt;
    }

	

}

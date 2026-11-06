package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]")WebElement loginbtn;
	
	public Loginpage(WebDriver driver) { //constructor -->classname is constructor name
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public String titlemthd()
	{
		String title=driver.getTitle();
		return title;
	}
	
	
	public void loginmthd(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		
	}
	
	public String url_mthd()
	{
		String actual_url=driver.getCurrentUrl();
		return actual_url;
	}

}

package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Cartpage;
import pagepkg.Checkoutpage;
import pagepkg.Homepage;
import pagepkg.Loginpage;
import pagepkg.Paymentpage;

public class Base_class {
	
	public static WebDriver driver;
	
	public  Loginpage loginobj;
	
	public Homepage  homeobj;
	
	public Cartpage cartobj;
	
	public Checkoutpage checkoutobj;
	
	public Paymentpage paymentobj;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options = new ChromeOptions(); //--
		options.addArguments("--incognito"); //--
		driver=new ChromeDriver(options);   //-- to open site in incognito mode
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objectmthd()
	{
	 loginobj=new Loginpage(driver);
	 homeobj=new Homepage(driver);
	 cartobj=new Cartpage(driver);
	 checkoutobj=new Checkoutpage(driver);
	 paymentobj=new Paymentpage(driver);
	}
}

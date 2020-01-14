import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkTwo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		ObjDriver.manage().window().maximize();
		WebElement username = ObjDriver.findElement(By.name("search"));
		highLightElement(ObjDriver,username);
		
	}

	public static void highLightElement(WebDriver ObjDriver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)ObjDriver;
		js.executeScript("arguments[0].setAttribute('style',"+"'bacground: yellow;border:2px solid red');", element);
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
			js.executeScript("arguments[0].setAttribute"+"('style','border:solid 2px white');", element);
	}
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class OneWeb 
{
	public static void main(String[] args) throws IOException 
	{
		Properties objprop = new Properties();
		try
		{
		objprop.load(new FileInputStream("C:\\Users\\admin\\Desktop\\data1.properties"));
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		 catch(IOException ex)
		{
			 ex.printStackTrace();
		}
		System.out.println("Login name"+objprop.getProperty("login"));
		System.out.println("password"+objprop.getProperty("pwd"));
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		System.out.println("Open opencart page loaded");
		String var1 = ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement Obj1 = ObjDriver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/account']" ));
		Obj1.click();
		WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
		Obj2.click();
		WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		Obj3.sendKeys(objprop.getProperty("login"));
		WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		Obj4.sendKeys(objprop.getProperty("pwd"));
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OneWeb 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		System.out.println("Open opencart page loaded");
		String var1 = ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement Obj1 = ObjDriver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a" ));
		Obj1.click();
		WebElement Obj2 = ObjDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		Obj2.click();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String object = reader.readLine();
		WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		Obj3.sendKeys("obama@trump.com");
		WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		Obj4.sendKeys("jojopogo");
	}
}

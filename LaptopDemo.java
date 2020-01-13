import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LaptopDemo
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com/index.php?route=product/category&path=18");
		WebElement filter_dropdown=ObjDriver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
		Select filter=new Select(filter_dropdown);
		List<WebElement> dropdown=filter.getOptions();
		int count=0;
		for(int i=0;i<=dropdown.size()-1;i++)
		{
		if(i==1|| i==dropdown.size()-1)
		{
		String drop_down_values=dropdown.get(i).getText();
		count++;
		System.out.println("dropdown values are "+ drop_down_values);
		}
		}
		WebElement filter_dropdown1=ObjDriver.findElement(By.xpath("//*[@id=\"input-limit\"]"));
		Select filter1=new Select(filter_dropdown1);
		List<WebElement> dropdown1=filter1.getOptions();
		for(int i=0;i<=dropdown1.size()-1;i++)
		{
		if(i==1|| i==dropdown1.size()-1)
		{
		String drop_down_values1=dropdown1.get(i).getText();
		System.out.println("dropdown values are "+ drop_down_values1);
		}
		}
		
	}
}
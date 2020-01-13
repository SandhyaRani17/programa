import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
		WebElement radio_button = objDriver.findElement(By.name("radiooptions"));
		boolean status=radio_button.isDisplayed();
		System.out.println("radio button is displayed >>"+status);
		boolean enabled_status=radio_button.isEnabled();
		System.out.println("radio button is enbaled >>"+enabled_status);
		boolean selected_status=radio_button.isSelected();
		System.out.println("radio button is selected >>"+selected_status);
		boolean selected_status_new=radio_button.isSelected();
		System.out.println("radio button is selected >>"+selected_status_new);
		//a link will go with href
		//img link will go with src
		/*System.out.println("number of radio buttons"+links.size());
		for(WebElement ele:links) 
		{
		System.out.println(ele.getAttribute("href"));*/
		}
}


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
		WebElement check_button = objDriver.findElement(By.xpath("//*[@id=\"checkbox1\"]" ));
		check_button.click();
		boolean status=check_button.isDisplayed();
		System.out.println("check button is displayed >>"+status);
		boolean enabled_status=check_button.isEnabled();
		System.out.println("check button is enbaled >>"+enabled_status);
		WebElement check_button1 = objDriver.findElement(By.xpath("//*[@id=\"checkbox2\"]" ));
		check_button1.click();
		boolean status1=check_button1.isDisplayed();
		System.out.println("check button is displayed >>"+status1);
		boolean enabled_status1=check_button.isEnabled();
		System.out.println("check button is enbaled >>"+enabled_status1);
		WebElement check_button2 = objDriver.findElement(By.xpath("//*[@id=\"checkbox3\"]" ));
		check_button2.click();
		boolean status2=check_button.isDisplayed();
		System.out.println("check button is displayed >>"+status2);
		boolean enabled_status2=check_button.isEnabled();
		System.out.println("check button is enbaled >>"+enabled_status2);
		WebElement radio_button = objDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		boolean status3=radio_button.isDisplayed();
		System.out.println("radio button is displayed >>"+status3);
		radio_button.click();
		WebElement radio_button1 = objDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		boolean status4=radio_button1.isDisplayed();
		System.out.println("radio button is displayed >>"+status4);
		radio_button.click();
	}
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Currency 
{
	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		   WebDriver Objdriver=new ChromeDriver();    
		   Objdriver.get("http://demo.opencart.com");   
		   Objdriver.manage().window().maximize();  
		   Objdriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")).click();
		   Objdriver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		   System.out.println("The US Price is:");
		   String a = Objdriver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).getText();
		   System.out.println(a);
		   System.out.println("The Indian Price is :");
		   String b=a.substring(1);
		   double result = Double.parseDouble(b);
		   double inr = result*75;
		   System.out.println(inr);
		   System.out.println("The Euro price is :");
		   double eur = result*0.90;
		   System.out.println(eur);
		   System.out.println("The pound price is :");
		   double pnd = result*0.77;
		   System.out.print(pnd);
		}
}

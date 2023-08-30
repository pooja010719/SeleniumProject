package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://test.rack-eye.com/login");
	WebElement Username=driver.findElement(By.id("username"));
	Username.sendKeys("pooja.testing");
	WebElement Password=driver.findElement(By.id("password"));
	Password.sendKeys("Asafe123!");	
	WebElement LoginButton=driver.findElement(By.className("submit"));
	LoginButton.click();		
	Thread.sleep(3000);
	String dashboard_actualtext=driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div/h2")).getText();
	String exp_value="Dashboard";
if(dashboard_actualtext.equals(exp_value))
{
	System.out.println("Login test passed");
} else
	System.out.println("Login test failed");

String Actual_Title=driver.getTitle();
String Expected_Title="A-SAFE RackEye - Test";
if(Actual_Title.equals(Expected_Title))
{
	System.out.println("test passed");
} else
	System.out.println("test failed");

driver.close();

}
}

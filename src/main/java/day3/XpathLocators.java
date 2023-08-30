package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class XpathLocators {

	public static void main(String[] args) {
		
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
	String prodname=driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
	System.out.println(prodname);

	}

}
}

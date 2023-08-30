package day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.util.xml.impl.Input;
public class CSSLocators {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//by Css (tag#id)
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		//by CSS (tag[attribute='value']
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");		
				//by CSS (tag.class)
	//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");		
	//CSS (tag.class[attribute=value]
	}

}

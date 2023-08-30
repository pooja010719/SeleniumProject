package day3;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExceptionHandlingExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            driver.get("https://www.example.com");

            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nonExistentElement")));
            element.click(); // This won't be executed due to the exception
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("Timeout waiting for element: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Clean up resources, e.g., close the WebDriver
            driver.quit();
        }
    }
}

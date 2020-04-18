package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDoesNotWork {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        WebElement element = driver.findElement(By.id(""));

        // Dynamic path
        String projectDir = System.getProperty("user.dir");

        // Path of the file in the project
        String file = " src/test...     ";

        element.sendKeys(projectDir+file);


    }
}

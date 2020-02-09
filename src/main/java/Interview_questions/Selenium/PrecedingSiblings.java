package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.ConfigurationReader;

public class PrecedingSiblings {

    @Test
    public void staticPart() {   // [id="contactsmenu"]
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("try_cloud"));
        driver.findElement(By.id("user")).sendKeys("User1");

        WebElement element1 = driver.findElement(By.xpath(""));
    }


}

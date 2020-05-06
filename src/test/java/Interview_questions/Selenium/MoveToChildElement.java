package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.ConfigurationReader;

import java.security.Key;

public class MoveToChildElement {

    @Test
    public void staticPart() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("try_cloud"));
        driver.findElement(By.id("user")).sendKeys("User1");

        // XPATH
        // using position           // [id="contactsmenu"]
        WebElement element1 = driver.findElement(By.xpath("(//div[position()=2])[1]"));

        // using square brackets
        WebElement element2 = driver.findElement(By.xpath("(//div[2])[1]"));

        // CSS
        // using >
        WebElement element3 = driver.findElement(By.cssSelector("body>header[id='header']"));
        // using space
        WebElement element4 = driver.findElement(By.cssSelector("body header[id='header']"));



    }
}

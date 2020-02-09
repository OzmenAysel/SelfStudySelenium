package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

public class FindTheStaticPartOfID {

    @Test
    public void staticPart(){   // [id="contactsmenu"]
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("try_cloud"));
        driver.findElement(By.id("user")).sendKeys("User1");
        driver.findElement(By.id("password")).sendKeys("Userpass123", Keys.ENTER);
        // text()
        WebElement element1 = driver.findElement(By.xpath("(//span[text()='Name'])[1]"));
        //start-with
        WebElement element2 = driver.findElement(By.xpath("//div[starts-with(@id, 'notification-')]"));

        //<div id="notification-container">
        // contains
        WebElement element3 = driver.findElement(By.cssSelector("[id*='ion-cont'] "));
        //ends-with
        WebElement element4 = driver.findElement(By.cssSelector("[id$='n-container'] "));
        // startsWith
        WebElement element5 = driver.findElement(By.cssSelector("//[id*='notification-']"));



    }
}

package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;
import utils.Driver;

public class Iframe {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/frames");

        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement content = driver.findElement(By.tagName("body"));
        System.out.println(content.getText()); //LEFT

        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-bottom']")));
        WebElement content2 = driver.findElement(By.tagName("body"));
        System.out.println(content2.getText());  // BOTTOM


    }
}

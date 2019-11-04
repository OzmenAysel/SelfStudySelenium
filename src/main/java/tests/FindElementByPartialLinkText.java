package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByPartialLinkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        driver.findElement(By.linkText("Add/Remove Elements")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        //partialLinkText
        driver.findElement(By.partialLinkText("Drag")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Dynamic")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}

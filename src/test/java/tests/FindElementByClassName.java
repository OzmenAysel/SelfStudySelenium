package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByClassName {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        List<WebElement> example = driver.findElements(By.className("list-group-item"));
        Thread.sleep(2000);
        List<WebElement> example2 = driver.findElements(By.className("autocomplete"));
        System.out.println(example.size());
        System.out.println(example2.size());
        driver.quit();
    }
}

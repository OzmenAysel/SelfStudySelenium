package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        WebElement element = driver.findElement(By.tagName("[contains(text(), 'text')]"));
        WebElement element1 = driver.findElement(By.tagName("[.'text']"));
    }
}

package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserFactory;

public class PageSourceMethod_CheckTextPresent {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        System.out.println(driver.getPageSource()); // print all html document

        if(driver.getPageSource().contains("Text to check"))
            System.out.println("Text is present");

        driver.quit();
    }
}

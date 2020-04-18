package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ConfigurationReader;

public class ScrollDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://learn.letskodeit.com/p/practice");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        // ScrollDown
        js.executeScript("window.scrollBy(0,500)", "");  // OR   js.executeScript("scroll(0,500)");
        //ScrollUp
        js.executeScript("window.scrollBy(0,-250)", "");  // OR   js.executeScript("scroll(0,-250)");

    }
}

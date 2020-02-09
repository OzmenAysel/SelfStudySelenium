package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigurationReader;
import utils.Driver;

public class HighlightElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("lets_codeit"));
            // Inspect element
            WebElement username= driver.findElement(By.cssSelector("[id='carselect']"));
            // Call reuse method
            highLightElement(driver,username);
            Thread.sleep(5000);
        }

        // Element highlighter code
        public static void highLightElement(WebDriver driver, WebElement element) {
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid blue;');", element);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
        }
    }




package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

public class JS_SendKeys {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementBYID('User').value = 'www.goggle.com'");  // username
        js.executeScript("document.getElementById('pass').value='tester'");  // password
    }
}

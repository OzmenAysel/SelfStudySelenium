package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCapabilities {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        // To Accept SSL Certificate
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");

    }
}

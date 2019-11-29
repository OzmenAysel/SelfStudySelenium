package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--diable-popup-blocking");
        options.addArguments("test-type");
        options.addArguments("allow-running-insecure-content");

        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://google.com");

    }
}

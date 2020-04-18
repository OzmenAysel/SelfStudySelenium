package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ConfigurationReader;


public class maximize {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize
        // driver.manage().window().maximize();

        // driver.get(ConfigurationReader.getProperty("lets_codeit"));


        // In some cases maximize() will not work
        // Actions or change version

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get(ConfigurationReader.getProperty("lets_codeit"));
    }
}

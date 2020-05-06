package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsPractice {

    public static WebDriver driver ;

    public static void main(String[] args) {

        // 1- we use Chrome Options for maximize  --> check the maximize class

        // 2-
        WebDriverManager.chromedriver().setup();  // to configure chrome driver for test--> int is an interface
        ChromeOptions chromeOptions = new ChromeOptions(); // to run test without interface, set to true-->it is a class
        chromeOptions.setHeadless(false);
        driver=new ChromeDriver((chromeOptions));
    }
}

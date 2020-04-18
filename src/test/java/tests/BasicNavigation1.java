package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());
//        driver.close();


    }
}

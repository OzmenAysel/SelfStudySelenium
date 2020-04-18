package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // ????????
        driver.get("https://learn.letskodeit.com/p/practice");    System.out.println(driver.getTitle());
        driver.navigate().to("https://www.amazon.com/");     System.out.println(driver.getTitle());
        String handle = driver.getWindowHandle();
        driver.switchTo().window(handle);
        driver.getTitle();
    }
}

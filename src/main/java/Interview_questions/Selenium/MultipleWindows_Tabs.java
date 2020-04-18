package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class MultipleWindows_Tabs {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/"); System.out.println(driver.getTitle());
        BrowserUtils.wait(3);
        driver.get("https://www.amazon.com/");  System.out.println(driver.getTitle());

        // Must switched to new window
        String handle = driver.getWindowHandle();

        // driver.getWindowHandles(); // for multiple windows

        driver.switchTo().window(handle);  // Returns the handle/id of current page ( as a string )

        String targetTitle = "Google";
        for(String handles : driver.getWindowHandles()) {
            driver.switchTo().window(handles);
            if (driver.getTitle().equals(targetTitle)) {

            }
        }



    }
}

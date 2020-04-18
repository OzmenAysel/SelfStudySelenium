package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;
import utils.ConfigurationReader;


public class JS_Alerts {

    public static void main(String[] args) {

        // If the alert on the browser comes from JavaScript, we use the Alert Interface.
        // alert.accept();
        // alert.dismiss();
        // alert.sendKeys();
        // alert.getText();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(ConfigurationReader.getProperty("lets_codeit"));
        BrowserUtils.wait(3);

        WebElement element2 = driver.findElement(By.name("enter-name"));
        element2.sendKeys("Aysel");
        BrowserUtils.wait(3);

        WebElement element = driver.findElement(By.id("alertbtn"));
        element.click();
        BrowserUtils.wait(3);

        Alert alert =driver.switchTo().alert();
        driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        driver.close();
    }


}

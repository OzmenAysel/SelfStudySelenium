package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DoubleClickSyntax {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));

        // ??????
        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();
        actions.moveToElement(element).perform();
        actions.doubleClick().perform();
         //OR
        actions.moveToElement(element).doubleClick().build().perform();

        ;

    }
}

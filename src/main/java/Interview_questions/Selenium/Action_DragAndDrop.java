package Interview_questions.Selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragAndDrop {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id(""));
        WebElement element2 = driver.findElement(By.id(""));
        actions.clickAndHold(element).moveToElement(element2).release().build().perform();
    }
}

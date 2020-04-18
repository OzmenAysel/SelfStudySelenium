package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckMultipleSelectedValuesInDropdown {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        WebElement element = driver.findElement(By.id(""));
        List<WebElement> element2 = driver.findElements(By.id(""));

        Select select = new Select(element);
        select.getOptions();
        select.getFirstSelectedOption();
        select.getAllSelectedOptions();

    }
}

package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckElement {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // To Check Present
        List<WebElement> elements = driver.findElements(By.xpath(""));
        if(elements.size() != 0)
            System.out.println("Element is present");
                    // OR
        WebElement element = driver.findElement(By.xpath(""));
        if(element.getSize() != null) // size Or getSize    NOT SURE
            System.out.println("Element is present");

        // To Check Visible
        WebElement element2 = driver.findElement(By.xpath(""));
        if(element2.isDisplayed());

        // To Check Enable
        WebElement element3 = driver.findElement(By.xpath(""));
        if(element2.isEnabled());

    }
}

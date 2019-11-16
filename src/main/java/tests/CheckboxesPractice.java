package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Checkboxes")).click();
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2")).click();

        // find all elements with tag name input
        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
                                                        //(By.cssSelector("input[type='checkbox']"))
                                                        //(By.xpath("//input[@type='checkbox']"))
        for(WebElement checkbox : checkboxes){    // loop through this list of elements
            Thread.sleep(2000);
            if(!checkbox.isSelected()){     // is checkbox is not selected yet
                checkbox.click();       // select it
            }
        }
        driver.quit();
    }
}

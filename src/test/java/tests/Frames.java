package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Frames {

    private WebDriver driver;

    @Test
    public void frameTest1(){
    driver=BrowserFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/iframe");
    driver.switchTo().frame("mce_0_ifr");  // id of iframe
        driver.findElement(By.id("tinymce")).clear();  // text of id (in iframe)
        driver.findElement(By.id("tinymce")).sendKeys("Test Automation");
        driver.switchTo().defaultContent();   // if we want to quit the frame
    }
}

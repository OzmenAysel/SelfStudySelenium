package Interview_questions.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.BrowserUtils;
import utils.Driver;

public class Select_Class {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement element =driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        select.selectByVisibleText("Option 2");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 2");



        WebElement state = driver.findElement(By.id("state"));
        Select select2 = new Select(state);
        select2.selectByValue("MD");
        BrowserUtils.wait(2);
        Assert.assertEquals(select2.getFirstSelectedOption().getText(), "Maryland");

        driver.close();
    }

}

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementByCssSelector {

    public static void main(String[] args) throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Aysel");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Dalcicek");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("AyselD");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ayseldalcicek07@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("12367890");
        driver.findElement(By.cssSelector("input[value='female']")).click();
        Select select = new Select (driver.findElement(By.cssSelector("select[name='job_title']")));
        select.selectByVisibleText("SDET");
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("10.15.1980");
        driver.findElement(By.cssSelector("div[class='col-sm-9 col-sm-offset-3']")).click();
        Thread.sleep(3000);
        driver.quit();
    }


}

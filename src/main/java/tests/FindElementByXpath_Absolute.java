package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class FindElementByXpath_Absolute {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(2000);

        WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[8]/a"));
        System.out.println(link.getText());
        link.click();

        /* We can also use this way
        driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[8]/a")).click();  */

        Thread.sleep(2000);
        driver.navigate().back();
        driver.close();








    }
}

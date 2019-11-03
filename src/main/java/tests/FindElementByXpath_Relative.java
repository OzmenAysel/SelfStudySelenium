package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class FindElementByXpath_Relative {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(2000);

        WebElement headText = driver.findElement(By.xpath("//span[@class='h1y']"));
        WebElement disElements = driver.findElement(By.xpath("//a[.='Disappearing Elements']"));
        System.out.println(headText.getText());
        System.out.println(disElements.getText());
        disElements.click();
        Thread.sleep(2000);
        driver.close();


    }
}

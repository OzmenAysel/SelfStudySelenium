package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.sql.SQLOutput;


public class PageTitleFindElementByClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println(title);
    }


}

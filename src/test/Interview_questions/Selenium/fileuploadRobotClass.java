package Interview_questions.Selenium;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.BrowserUtils;
import utils.ConfigurationReader;

public class fileuploadRobotClass {

        public static void main(String[] args) throws Exception {
            Robot robot = new Robot();
            System.setProperty("webdriver.gecko.driver", "C:/Users/aysel/Desktop/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get(ConfigurationReader.getProperty("try_cloud"));
            driver.findElement(By.id("user")).sendKeys("User1");
            driver.findElement(By.id("password")).sendKeys("Userpass123", Keys.ENTER);
            BrowserUtils.wait(6);
            driver.findElement(By.cssSelector("[class='icon icon-add']")).click();
            driver.findElement(By.cssSelector("[data-action='upload']")).click();
            robot.setAutoDelay(1000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


        }
    }


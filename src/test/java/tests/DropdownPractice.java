package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownPractice {

        static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws InterruptedException {
      //  selectByTextTest();
       // selectByValueTest();
       // selectByIndex();
       // multipleSelectedDropDownTest();
        nonSelectedDropdown();
    }

    public static void setup() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/dropdown");
        Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public static void selectByTextTest() throws InterruptedException {
        setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        driver.close();
    }

    public static void selectByValueTest() throws InterruptedException {
        setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByValue("DC");
        Thread.sleep(2000);

        String expected = "District Of Columbia";
        String actual = select.getFirstSelectedOption().getText();

        System.out.println("Expected "+expected);
        System.out.println("Actual "+actual);
        driver.close();
    }

    public static void selectByIndex() throws InterruptedException {
        setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByIndex(1);
        Thread.sleep(2000);
                    //  <option value="AL">Alabama</option>
        String expected = "Alabama";
        String actual = select.getFirstSelectedOption().getText();

        String expectedValue = "AL";
        String actualValue = select.getFirstSelectedOption().getAttribute("value");

        System.out.println("Expected: "+expected);
        System.out.println("Actual: "+actual);

        System.out.println("Expected: "+expectedValue);
        System.out.println("Actual: "+actualValue);

        driver.close();
    }

        public static void multipleSelectedDropDownTest() throws InterruptedException {
        setup();
        Thread.sleep(2000);

        Select select = new Select(driver.findElement(By.name("Languages")));

            List<WebElement> options = select.getOptions();  // it will give us all available options for selection

            for(WebElement option : options){
                Thread.sleep(1000);
                select.selectByVisibleText(option.getText());
            }
            Thread.sleep(1000);
            List<WebElement> selectedOptions = select.getAllSelectedOptions();
            for(WebElement option : selectedOptions ){
                System.out.println(option.getText());
            }

            Thread.sleep(3000);
            select.deselectAll();
          //  select.deselectByIndex(3);
            Thread.sleep(2000);
            driver.close();
        }

        public static void nonSelectedDropdown() throws InterruptedException {
            setup();
            Thread.sleep(5000);
            WebElement dropdown = driver.findElement(By.id("dropdownMenuLink"));
            WebElement option = driver.findElement(By.xpath("//a[text()='Amazon']"));
            dropdown.click();
            Thread.sleep(2000);
            option.click();
            Thread.sleep(2000);
            driver.close();
    }
}

package Interview_questions.JavaQuestions;
// Naveen
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Singleton_PageTest {

    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        Singleton_DriverInit instanceDriver = Singleton_DriverInit.getInstance();
        driver = instanceDriver.openBrowser();
    }

    @Test
    public void testMethod1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}

package Interview_questions.JavaQuestions;
// Naveen
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton_DriverInit {  // Used in Singleton_PageTest Class

    private static Singleton_DriverInit instanceDriver = null;
    private WebDriver driver;

    private Singleton_DriverInit(){

    }

    public WebDriver openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aysel\\OneDrive\\Desktop\\chromedriver.exe"); // does not work
        driver = new ChromeDriver();
        return driver;
    }

    public static Singleton_DriverInit getInstance(){
        if(instanceDriver == null) {
            instanceDriver = new Singleton_DriverInit();
        }
           return instanceDriver;
    }
}

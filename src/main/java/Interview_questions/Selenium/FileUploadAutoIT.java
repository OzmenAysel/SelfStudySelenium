package Interview_questions.Selenium;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.BrowserUtils;
import utils.Driver;

import java.io.IOException;

public class FileUploadAutoIT {

    public static void main(String[] args) {


        Driver.get().get("file:///C:/Users/aysel/OneDrive/Desktop/fileUpload.html");
        Driver.get().findElement(By.xpath(".//*[@id='1']")).click();
        BrowserUtils.wait(5);
//        try {
//           // Runtime.getRuntime().exec("C:\\Users\\aysel\\OneDrive\\Desktop\\AutoIT\\fileupload.exe");
//            Runtime.getRuntime().exec(System.getProperty("user.dir")+"/fileupload.exe");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

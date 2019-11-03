package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();  // to set up chrome driver
        ChromeDriver driver = new ChromeDriver();  // to create an object of ChromeDriver class

        String url = "http://google.com";
        String url2 = "http://amazon.com";

        driver.get(url);  // will open browser with url
        Thread.sleep(3000);  //  will put on hold current run on 3 second.

//        driver.navigate().to(url2);  //  navigate to the amazon.com
//        Thread.sleep(3000);  // wait for 3 seconds
//
//        driver.navigate().back();  // navigate back to the previous url - in our case it's a google.com
//        Thread.sleep(3000);  //  wait for 3 seconds
//
//        driver.navigate().forward(); //
//        Thread.sleep(3000);  //  wait for 3 seconds

        driver.navigate().refresh();  // will refresh page
        Thread.sleep(3000);

        driver.close();   // will close web driver
    }
}

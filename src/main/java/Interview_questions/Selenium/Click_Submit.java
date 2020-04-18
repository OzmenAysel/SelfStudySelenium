package Interview_questions.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Click_Submit {
    public static void main(String[] args) {


        //alternative to click, only if type="submit"
        WebElement retrievePasswordButton = Driver.get().findElement(By.id("form_submit"));
        retrievePasswordButton.submit();
    }
}

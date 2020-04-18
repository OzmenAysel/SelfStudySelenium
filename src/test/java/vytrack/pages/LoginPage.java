package vytrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserFactory;

public class LoginPage {

   // WebDriver driver = Driver.get.......

    @FindBy(id = "prependedInput")
    public WebElement userNameElement;

    @FindBy(id = "prependedInput2")
    public WebElement passwordElement;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginBtn.click();
    }




}

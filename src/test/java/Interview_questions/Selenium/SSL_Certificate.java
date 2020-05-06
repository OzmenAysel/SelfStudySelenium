package Interview_questions.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import utils.Driver;

public class SSL_Certificate {

    public static void main(String[] args) {
        FirefoxProfile ssl = new FirefoxProfile();
        ssl.setAcceptUntrustedCertificates(true);
        ssl.setAssumeUntrustedCertificateIssuer(false);

       //  WebDriver ins = new FirefoxDriver(ssl);  ???

        Driver.get().navigate().to("javascript:document.getElementByID('overridelink').click()");

    }

}
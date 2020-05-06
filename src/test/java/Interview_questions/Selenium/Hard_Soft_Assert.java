package Interview_questions.Selenium;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Assert {

    /* Hard vs Soft assert
     Main difference is when condition fails,
     soft assertion will not stop execution until reaching AssertAll() method.
     hard assertion will stop the test case of failure
    */
    @Test
    public void test() {

        // Hard Assert
        Assert.assertFalse(false);  // coming from TestNG
        Assert.assertTrue(false);
        Assert.assertEquals("","");

        // Soft Assert
        SoftAssert softAssert = new SoftAssert();   // coming from TestNG
        softAssert.equals("");
        softAssert.toString();
        softAssert.assertEquals("","");
        softAssert.assertTrue(true);
        softAssert.assertFalse(false);
    }

    @AfterMethod
    public void teradown() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();

    }
}

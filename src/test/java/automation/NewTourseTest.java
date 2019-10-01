package automation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.TestBase;
import pages.NewToursePage;

public class NewTourseTest extends TestBase {

    NewToursePage newToursePage;

    @Parameters({"uName","psswd"})
    @Test(priority = 1)
    public void loginTest1(String userName, String password) {

        driver.get("http://newtours.demoaut.com/");

        //Create Login Page object
        newToursePage = new NewToursePage(driver);

        newToursePage.loginToNewTours(userName, password);

        String signOffText = newToursePage.getSignOFF();

        Reporter.log("signOffText is :: " + signOffText, true);

        Assert.assertEquals(signOffText, "SIGN-OFF");

        if(signOffText.equals("SIGN-OFF")) {
            Reporter.log("Successfully logged in",true);
        } else {
            Reporter.log("Login failed",true);
        }

        newToursePage.logoutNewTours();

    }

    @Parameters({"uName","psswd"})
   @Test(priority = 2)
    public void loginTest2(String userName, String password) {

        driver.get("http://newtours.demoaut.com/");

        //Create Login Page object
        newToursePage = new NewToursePage(driver);

        newToursePage.loginToNewTours(userName, password);

        String signOffText = newToursePage.getSignOFF();

        System.out.println("signOffText is :: " + signOffText);

        Assert.assertEquals(signOffText, "SIGN-OF");

        newToursePage.logoutNewTours();


    }


}

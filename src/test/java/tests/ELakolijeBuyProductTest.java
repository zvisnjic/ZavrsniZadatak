package tests;

import org.junit.Test;
import pages.ELakolijeLogInUserPage;
import pages.ElakolijeBuyProductPage;


public class ELakolijeBuyProductTest extends BaseTest {

    @Test

    public void eLakolijeLoging() throws InterruptedException {


        String userName = "zvisnjic@neobee.net";
        String passWord = "wurth232";
        String url = "https://elakolije.rs/";

        ElakolijeBuyProductPage openLogInPage = new ElakolijeBuyProductPage(driver);
        openLogInPage.openLogInForm(url);

        ELakolijeLogInUserPage logInUser = new ELakolijeLogInUserPage(driver);
        logInUser.loggingCostumer(userName, passWord);


            Thread.sleep(2000);
        }
    }


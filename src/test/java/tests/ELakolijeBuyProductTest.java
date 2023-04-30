package tests;

import org.junit.Test;
import pages.ELakolijeHomePage;
import pages.ELakolijeLogInUserPage;
import pages.ElakolijeBuyProductPage;
import pages.ELakolijeFindProductPage;


public class ELakolijeBuyProductTest extends BaseTest
{

    @Test

    public void eLakolijeLoging() throws InterruptedException
    {


        String userName = "zvisnjic@neobee.net";
        String passWord = "wurth232";
        String url = "https://elakolije.rs/";
        String searchTerm = "hleb";

        ELakolijeHomePage runHomePage = new ELakolijeHomePage(driver);
        runHomePage.runPage(url);

        ElakolijeBuyProductPage openLogInPage = new ElakolijeBuyProductPage(driver);
        openLogInPage.clickPrijava();

        ELakolijeLogInUserPage logInUser = new ELakolijeLogInUserPage(driver);
        logInUser.loggingCostumer(userName, passWord);

        ELakolijeFindProductPage searchProduct = new ELakolijeFindProductPage(driver);
        searchProduct.searchingResult(searchTerm);


            Thread.sleep(2000);
    }
}


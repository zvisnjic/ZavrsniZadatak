package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.ELakolijeHomePage;
import pages.ELakolijeFindProductPage;


public class ELakolijeSearchTermPresensTest extends BaseTest
{

    @Test

    public void findProduct() throws InterruptedException
    {

        String url = "https://elakolije.rs/";
        String searchTerm = "mleko";

        ELakolijeHomePage runHomePage = new ELakolijeHomePage(driver);
        runHomePage.runPage(url);

        ELakolijeFindProductPage elementFind = new ELakolijeFindProductPage(driver);
        elementFind.searchingResult(searchTerm);

        /*BuySearchedTerm userLogging = new BuySearchedTerm(driver);
        userLogging.userLogIn();*/

        //ASSERT ZA OTVARANJE KLIKNUTOG ARTIKLA IZ LISTE

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("artikli_lista")));
        WebElement results = driver.findElement(By.id("artikli_lista"));


        Assert.assertTrue(results.getText().toLowerCase().contains(searchTerm.toLowerCase()),
                "ELakolijTest test fall");

        Thread.sleep(5000);
    }

}

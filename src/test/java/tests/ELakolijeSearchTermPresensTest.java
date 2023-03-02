package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.FindProductELakolijePage;


public class ELakolijeSearchTermPresensTest extends BaseTest{

    @Test

    public void findProduct() throws InterruptedException {

        String url = "https://elakolije.rs/";
        String searchTerm = "hleb";

        FindProductELakolijePage elementFind = new FindProductELakolijePage(driver);
        elementFind.searchingResult(url, searchTerm);

        /*BuySearchedTerm userLogging = new BuySearchedTerm(driver);
        userLogging.userLogIn();*/

        //ASSERT ZA OTVARANJE KLIKNUTOG ARTIKLA IZ LISTE

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("artikli_lista")));
        WebElement results = driver.findElement(By.id("artikli_lista"));


        Assert.assertTrue(results.getText().toLowerCase().contains(searchTerm.toLowerCase()),
                "ELakolijTest test fall");

        Thread.sleep(2000);
    }
}

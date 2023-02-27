package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BlicHomePage;
import pages.BlicSearchResultsPage;

public class BlicSearchTest extends BaseTest{

    @Test
    public void searchBlic() throws InterruptedException {
        String url = "https://www.blic.rs/";
        String searchTerm = "Veselin Jevrosimović";
        int articleNumber = 7;
        String naslov;


        BlicHomePage blicSearch = new BlicHomePage(driver);
        blicSearch.runSearch(url,searchTerm);

        BlicSearchResultsPage resultsPage = new BlicSearchResultsPage(driver);
        resultsPage.clickOnRequestedArticle(articleNumber);

        naslov = resultsPage.title;


        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("article__header")));
        WebElement artikal = driver.findElement(By.className("article__header"));



        Assert.assertTrue("Ocekivani clanak nije otvoren.",
                artikal.getText().toLowerCase().contains(naslov.toLowerCase()));


        Thread.sleep(5000);
    }
}


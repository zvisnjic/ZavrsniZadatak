package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlicHomePage extends BaseHelper {

    WebDriver driver;

    public BlicHomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search-open")
    WebElement searchButton;

    @FindBy(id = "cmpbntyestxt")
    WebElement popupButton;

    @FindBy(id = "search-input")
    WebElement searchField;

    @FindBy(id = "search")
    WebElement searchComponent;

    // run blic.rs

    private void runBlicHomePage (String url){

        driver.get(url);
        wdWait.until(ExpectedConditions.elementToBeClickable(popupButton));
        popupButton.click();

    }
    //klik on search button

    private void clickSearchButtonInput(){

        wdWait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();


    }

    // input search term

    private void inputSearchTerm(String searchTerm){
        wdWait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(searchTerm);

    }

    //klik on search button

    private void clickSearchButton(){

        wdWait.until(ExpectedConditions.visibilityOf(searchComponent));
        WebElement secondSearchButton = searchComponent.findElement(By.tagName("button"));
        secondSearchButton.click();


    }

    public void runSearch(String url, String searchTerm) throws InterruptedException {

        runBlicHomePage(url);
        clickSearchButtonInput();
        inputSearchTerm(searchTerm);
        clickSearchButton();

    }
}


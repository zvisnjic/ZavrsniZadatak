package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElakolijeBuyProductPage extends BaseHelper {

    WebDriver driver;

    public ElakolijeBuyProductPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "slika_pri")
    WebElement buttonPrijava;

    @FindBy(id = "close")
    WebElement newsletterIcon;

    public void clickPrijava(){

        wdWait.until(ExpectedConditions.elementToBeClickable(buttonPrijava));
        buttonPrijava.click();
    }

   }

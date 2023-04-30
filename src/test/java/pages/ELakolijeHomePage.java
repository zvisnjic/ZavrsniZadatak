package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ELakolijeHomePage extends BaseHelper {

    WebDriver driver;

    public ELakolijeHomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "close")
    WebElement newsletterIcon;

    public void runPage(String url){

        driver.get(url);
        wdWait.until(ExpectedConditions.visibilityOf(newsletterIcon));
        newsletterIcon.click();

    }
}

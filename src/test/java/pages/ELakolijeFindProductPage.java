package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ELakolijeFindProductPage extends BaseHelper
{

    WebDriver driver;

    public ELakolijeFindProductPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "zaglavlje_unos")
    WebElement searchField;

    @FindBy(id = "zaglavlje_lupica")
    WebElement searchIcon;

    private void inputSearchTerm(String searchTerm)
    {

        wdWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zaglavlje_unos")));
        searchField.sendKeys(searchTerm);
    }

    private void clickSearchIcon()
    {

        searchIcon.click();

    }

    public void searchingResult(String searchTerm)
    {

        inputSearchTerm(searchTerm);
        clickSearchIcon();

    }

}

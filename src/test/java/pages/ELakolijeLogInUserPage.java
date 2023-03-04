package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ELakolijeLogInUserPage extends BaseHelper {

    WebDriver driver;

    public ELakolijeLogInUserPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "par_7")
    WebElement userNameField;

    @FindBy(name = "par_8")
    WebElement passWordField;

    @FindBy(xpath = "//input[@value='POTVRDI']")
    WebElement prijavaButton;

    private void userNameInput(String userName){

        wdWait.until(ExpectedConditions.visibilityOf(userNameField));
        userNameField.sendKeys(userName);

    }
    private void passWordInput(String passWord) {

        passWordField.sendKeys(passWord);

    }
    private void clickPrijava() {

        prijavaButton.click();

    }

    public void loggingCostumer(String userName, String passWord){

        userNameInput(userName);
        passWordInput(passWord);
        clickPrijava();
    }

}





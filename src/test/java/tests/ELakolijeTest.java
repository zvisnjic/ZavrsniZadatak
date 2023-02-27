package tests;

import org.junit.Test;
import pages.FindProductELakolijeTest;



public class ELakolijeTest extends BaseTest{

    @Test

    public void findProduct() throws InterruptedException {

        String url = "https://elakolije.rs/";
        String searchTerm = "hleb";

        FindProductELakolijeTest elementFind = new FindProductELakolijeTest(driver);
        elementFind.searchingResult(url, searchTerm);

        Thread.sleep(2000);
    }
}

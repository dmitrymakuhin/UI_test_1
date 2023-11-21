package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.TestInit;
import utils.DriverBuffer;

public class TestGoogleFields extends TestInit {

    @Test
    public void runGoogle() {
        GoogleHomePage googleHomePage = new GoogleHomePage();

        googleHomePage
                .open()
                .search("cars");

        Assert.assertTrue(DriverBuffer.getDriver().getCurrentUrl().contains("q=cars"));
    }

    @Test
    public void clickPostButton() {
        GoogleHomePage googleHomePage = new GoogleHomePage();

        googleHomePage
                .open()
                .gmailButton().click();
    }
}

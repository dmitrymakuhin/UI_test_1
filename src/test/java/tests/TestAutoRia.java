package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoRiaHomePage;
import pages.TestData;
import pages.TestInit;

public class TestAutoRia extends TestInit {

    @Test
    public void sellAutoButton() {
        AutoRiaHomePage autoRiaHomePage = new AutoRiaHomePage();

        autoRiaHomePage
                .open()
                .sellAutoButton().click();

        Assert.assertTrue(autoRiaHomePage.addPhoto().isDisplayed(), "add image function is not displayed");


    }

    @Test
    public void signInProcess() throws InterruptedException {
        AutoRiaHomePage autoRiaHomePage = new AutoRiaHomePage();

        autoRiaHomePage
                .open()
                .signInButtonClick()
                .scroll();
//                .fillMail(TestData.USER_EMAIL)
//                .fillPassword(TestData.USER_PASSWORD);
        //Assert.assertTrue(autoRiaHomePage.mailInput().isDisplayed(), "mail input field is not visible");
        Assert.assertTrue(autoRiaHomePage.registrationFields().isDisplayed(), "fields is not visible");

    }


}

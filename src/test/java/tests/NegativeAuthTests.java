package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.NegativeAuthPage;
import pages.TestInit;

public class NegativeAuthTests extends TestInit {

    @DataProvider
    private Object[][] getDataPassword() {
        return new Object[][] {
                {"1", "Min length is 8"},
                {"9853232578325787987983257878328723-19875-129837-58123789-", "Max length is 20"},
                {"админ1234", "Only latin letters or numbers and chars"},
                {"11111111111", "At least 1 lowercase alphabetical character"}
        };
    }

    @DataProvider
    private Object[][] getDataEmail() {
        return new Object[][] {
                {"admin123", "Email is not valid"},
                {"почта@gmail.com", "Email is not valid"}
        };
    }

    @Test(dataProvider = "getDataPassword")
    public void checkNegPassword(String password, String expectedResult) {
        NegativeAuthPage negativeAuthPage = new NegativeAuthPage();

        negativeAuthPage
                .signUpPage()
                .setPassword(password);

        Assert.assertEquals(negativeAuthPage.getPasswordValidationField(), expectedResult);
    }

    @Test(dataProvider = "getDataEmail")
    public void checkNegEmail(String email, String expectedResult) {
        NegativeAuthPage negativeAuthPage = new NegativeAuthPage();

        negativeAuthPage
                .signUpPage()
                .setEmail(email);

        Assert.assertEquals(negativeAuthPage.getEmailValidationField(), expectedResult);
    }
}

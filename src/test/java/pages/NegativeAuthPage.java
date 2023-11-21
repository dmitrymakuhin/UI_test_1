package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverBuffer;

import java.time.Duration;

public class NegativeAuthPage extends BasePage {

    public NegativeAuthPage() {
        PageFactory.initElements(DriverBuffer.getDriver(), this);
    }

    public NegativeAuthPage signUpPage() {
        DriverBuffer.getDriver().get("https://tidex.com/register");
        return this;
    }

    public WebElement passWordField() {
        return DriverBuffer.getDriver().findElement(By.xpath("//input[@type='password']"));
    }


    public NegativeAuthPage setPassword(String text) {
        passWordField().sendKeys(text + "\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public WebElement passwordValidationField() {
        return new WebDriverWait(DriverBuffer.getDriver(), Duration.ofSeconds(12)).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//div[@label=\"Password\"]//div[contains(@class, 'error-wrapper')]/span")));

    }

    public String getPasswordValidationField() {
        return passwordValidationField().getText();
    }

    public WebElement emailField() {
        return DriverBuffer.getDriver().findElement(By.xpath("//input[@type='email']"));
    }

    public NegativeAuthPage setEmail(String text) {
        emailField().sendKeys(text + "\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
    public WebElement emailValidationField() {
        return new WebDriverWait(DriverBuffer.getDriver(), Duration.ofSeconds(12)).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//span[@data-v-1d8eae98]")));

    }
    public String getEmailValidationField() {
        return emailValidationField().getText();
    }


}

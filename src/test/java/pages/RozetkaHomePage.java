package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverBuffer;

import java.time.Duration;

public class RozetkaHomePage extends BasePage {

    public RozetkaHomePage() {
        PageFactory.initElements(DriverBuffer.getDriver(), this);
    }

    public RozetkaHomePage open() {
        DriverBuffer.getDriver().get("https://rozetka.com.ua/ua/");
        return this;
    }

    @FindBy(xpath = "//input[@formcontrolname='text']") //поисковая строка rozetka
    private WebElement searchField;

    public ResultItemsPage search(String text) {
        searchField.sendKeys(text + "\n");
        return new ResultItemsPage();
    }

    public WebElement rozetkaLogo () {
        return DriverBuffer.getDriver().findElement(By.xpath("//img[@alt='Rozetka Logo']"));
    }

}

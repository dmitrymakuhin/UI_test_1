package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverBuffer;

public class GoogleHomePage extends BasePage {
    @FindBy(xpath = "//textarea[@id='APjFqb']") //поисковая строка гугл
    private WebElement searchField;

    public void search(String text) {
        searchField.sendKeys(text + "\n");
    }

    public GoogleHomePage() {
        PageFactory.initElements(DriverBuffer.getDriver(), this);
    }

    public GoogleHomePage open() {
        DriverBuffer.getDriver().get("https://www.google.com.ua/");
        return this;
    }

    public WebElement gmailButton() {
        return DriverBuffer.getDriver().findElement(By.xpath("//a[text()='Gmail']"));
    }


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverBuffer;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class ResultItemsPage extends BasePage {

    public ResultItemsPage() {
        PageFactory.initElements(DriverBuffer.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class=\"goods-tile__title\"]")
    private List<WebElement> itemsTitle;

    public List<String> getItemsTitle() {
        new WebDriverWait(DriverBuffer.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOfAllElements(itemsTitle));

        return itemsTitle
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}

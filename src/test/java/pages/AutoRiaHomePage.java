package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverBuffer;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class AutoRiaHomePage extends BasePage {

    public AutoRiaHomePage() {
        PageFactory.initElements(DriverBuffer.getDriver(), this);
    }

    public AutoRiaHomePage open() {
        DriverBuffer.getDriver().get("https://auto.ria.com/uk/");
        return this;
    }
    public WebElement sellAutoButton() {
        return DriverBuffer.getDriver().findElement(By.xpath("//a[@href='https://auto.ria.com/uk/add_auto.html']"));
    }

    public WebElement signInButton(){
        return DriverBuffer.getDriver().findElement(By.xpath("//span[@class='tl']"));
    }
    public AutoRiaHomePage signInButtonClick(){
        signInButton().click();
        return this;
    }
    public AutoRiaHomePage scroll(){
        JavascriptExecutor js = (JavascriptExecutor) DriverBuffer.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        return this;
    }
    public WebElement mailInput() throws InterruptedException {
        //Thread.sleep(5000);
       return DriverBuffer.getDriver().findElement(By.xpath("//input[@id='emailloginform-email']"));
    }


//        public AutoRiaHomePage fillMail(String mail) throws InterruptedException {
//        mailInput().sendKeys(mail);
//        return this;
//    }

    public WebElement passwordInput(){
        return DriverBuffer.getDriver().findElement(By.xpath("//input[@id='emailloginform-password']"));
    }

    public WebElement registrationFields(){
        return DriverBuffer.getDriver().findElement(By.xpath("//form[@id='login-form']"));
    }

    //form[@id='login-form']
//    public AutoRiaHomePage fillPassword(String password){
//        passwordInput().sendKeys(password);
//        return this;
//    }

    public WebElement addPhoto(){
        return DriverBuffer.getDriver().findElement(By.xpath("//div[@id='photoItemsWrapper']/a[@id='addPhoto']"));
    }


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverBuffer;

public class EvaHomePage extends BasePage{

    public EvaHomePage(){
        PageFactory.initElements(DriverBuffer.getDriver(), this);
    }

    public EvaHomePage open(){
        DriverBuffer.getDriver().get("https://eva.ua/ua/");
        return this;
    }

    public WebElement pickupIcon(){
        return DriverBuffer.getDriver().findElement(By.xpath("//a[@class='sf-link nav-top__el nav-top__el--stockists']"));
    }

    public EvaHomePage clickPickupIcon(){
        pickupIcon().click();
        return this;
    }

    public WebElement infoBunner(){
        return DriverBuffer.getDriver().findElement(By.xpath("//div[@class='o-info-banner__container']"));
    }

//    public WebElement deleteGoodIcon(){
//        return DriverBuffer.getDriver().findElement(By.xpath(""));
//
//    }
//
//    public EvaHomePage clickDeleteGoodIcon(){
//    }

}

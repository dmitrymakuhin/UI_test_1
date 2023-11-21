package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverBuffer;

public abstract class TestInit {

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        DriverBuffer.setDriver(new ChromeDriver());
    }

    @AfterMethod
    public void tearDown() {
        DriverBuffer.quiteDriver();
    }
}

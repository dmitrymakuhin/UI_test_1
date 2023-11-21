package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverBuffer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public abstract class TestInit {

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("screenResolution", "1280x1024");
        hashMap.put("enableVNC", false);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("108.0");
        capabilities.setCapability("selenoid:options", hashMap);

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.68.233:4444/wd/hub"), capabilities);
        DriverBuffer.setDriver(driver);
    }

    @AfterMethod
    public void tearDown() {
        DriverBuffer.quiteDriver();
    }
}

package utils;

import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DriverBuffer {

    private static final Map<Long, WebDriver> driverPool = new ConcurrentHashMap<>();

    public static void setDriver(WebDriver driver) {
        driverPool.put(Thread.currentThread().getId(), driver);
    }

    public static WebDriver getDriver() {
        return driverPool.get(Thread.currentThread().getId());
    }

    public static void quiteDriver() {
        driverPool.get(Thread.currentThread().getId()).quit();
        driverPool.remove(Thread.currentThread().getId());
    }
}

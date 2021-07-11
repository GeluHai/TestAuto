package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static Driver driver = null;
    public static RemoteWebDriver webDriver;

    private Driver() {
        setNewDriver();
    }

    public static Driver getInstance() {
        if (driver == null) {
            driver = new Driver();
        }
        return driver;
    }

    public void setNewDriver() {
        try {
            if (webDriver != null) {
                webDriver.close();
                webDriver.quit();
            }
        } catch (Exception e) {

        } finally {
            webDriver = null;
        }
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gelu.haiduc\\Documents\\GitHub\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    public static void exit() {
        try {
            if (webDriver != null) {
                webDriver.close();
                webDriver.quit();
            }
        } catch (Exception e) {

        } finally {
            webDriver = null;
            driver = null;
        }
    }

    public void navigate(String url) {
        webDriver.get(url);
    }

    public void waitForElementToAppear(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver.webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void waitForElementToAppear(By by) {
        WebDriverWait wait = new WebDriverWait(driver.webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}

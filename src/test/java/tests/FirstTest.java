package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    public static Driver driver = null;
    String baseUrl = "http://automationpractice.com";


    @Test
    public void firstTest() {
        driver = Driver.getInstance();
        driver.navigate(baseUrl);

        driver.webDriver.findElement(By.id("header_logo"));
        driver.webDriver.findElement(By.className("container"));
        driver.webDriver.findElement(By.cssSelector("img[alt='My Store']"));
        driver.webDriver.findElement(By.xpath("//div[@id='header_logo']//img[@alt='My Store']"));


        driver.exit();
    }

    @Test
    public void findDressTest() {
        //1. Navigate to http://automationpractice.com
        //2. Search for “dress”
        //3. Click on the first item on the page
        //4. Add to cart

        driver = Driver.getInstance();

        driver.navigate(baseUrl);

        WebElement searchField = driver.webDriver.findElement(By.xpath("/html//input[@id='search_query_top']"));
        searchField.sendKeys("dress");
        WebElement searchButton = driver.webDriver.findElement(By.xpath("//form[@id='searchbox']/button[@name='submit_search']"));
        searchButton.click();

        WebElement firstProduct = driver.webDriver.findElement(By.xpath("//div[@id='center_column']/ul/li[1]"));
        firstProduct.click();

        WebElement iFrameModal = driver.webDriver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
        driver.waitForElementToAppear(iFrameModal);
        driver.webDriver.switchTo().frame(iFrameModal);

        WebElement addToCartButton = driver.webDriver.findElement(By.xpath("//p[@id='add_to_cart']/button[@name='Submit']"));
        addToCartButton.click();

        driver.exit();
    }

    @Test
    public void changeDressAttributesTest() {
        //1. Navigate to http://automationpractice.com
        //2. Search for “dress”
        //3. Click on the second item on the page
        //4. Change size
        //5. Change color
        //6. Add to cart

        driver = Driver.getInstance();

        driver.navigate(baseUrl);

        WebElement searchField = driver.webDriver.findElement(By.xpath("/html//input[@id='search_query_top']"));
        searchField.sendKeys("dress");
        WebElement searchButton = driver.webDriver.findElement(By.xpath("//form[@id='searchbox']/button[@name='submit_search']"));
        searchButton.click();

        WebElement secondProduct = driver.webDriver.findElement(By.xpath("//div[@id='center_column']/ul/li[2]"));
        secondProduct.click();

        WebElement iFrameModal = driver.webDriver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
        driver.waitForElementToAppear(iFrameModal);
        driver.webDriver.switchTo().frame(iFrameModal);

        WebElement quantityField = driver.webDriver.findElement(By.id("quantity_wanted"));
        quantityField.sendKeys("2");

        WebElement colorPink = driver.webDriver.findElement(By.id("color_24"));
        colorPink.click();

        WebElement addToCartButton = driver.webDriver.findElement(By.xpath("//p[@id='add_to_cart']/button[@name='Submit']"));
        addToCartButton.click();

        driver.exit();
    }

    @Test
    public void checkoutDeleteFlowTest() {
        //1. Navigate to http://automationpractice.com
        //2. Search for “dress”
        //3. Click on any item on the page
        //4. Change size and quantity
        //5. Change color if possible
        //6. Add to cart
        //7. Click Proceed to checkout
        //8. Delete the product

        driver = Driver.getInstance();

        driver.navigate(baseUrl);

        WebElement searchField = driver.webDriver.findElement(By.xpath("/html//input[@id='search_query_top']"));
        searchField.sendKeys("dress");
        WebElement searchButton = driver.webDriver.findElement(By.xpath("//form[@id='searchbox']/button[@name='submit_search']"));
        searchButton.click();

        WebElement secondProduct = driver.webDriver.findElement(By.xpath("//div[@id='center_column']/ul/li[3]"));
        secondProduct.click();

        WebElement iFrameModal = driver.webDriver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
        driver.waitForElementToAppear(iFrameModal);
        driver.webDriver.switchTo().frame(iFrameModal);

        WebElement quantityField = driver.webDriver.findElement(By.id("quantity_wanted"));
        quantityField.sendKeys("2");

        Select sizeDropDown = new Select(driver.webDriver.findElement(By.id("group_1")));
        sizeDropDown.selectByIndex(1);

        if (driver.webDriver.findElements(By.id("color_24")).size() != 0) {
            WebElement colorPink = driver.webDriver.findElement(By.id("color_24"));
            colorPink.click();
        }

        WebElement addToCartButton = driver.webDriver.findElement(By.xpath("//p[@id='add_to_cart']/button[@name='Submit']"));
        addToCartButton.click();

        driver.waitForElementToAppear(By.id("layer_cart"));
        WebElement proceedToCheckoutButton = driver.webDriver.findElement(By.xpath("//div[@id='layer_cart']//a[@title='Proceed to checkout']/span"));
        proceedToCheckoutButton.click();

        driver.waitForElementToAppear(By.id("cart_title"));
        WebElement deleteFirstItemButton = driver.webDriver.findElement(By.xpath("//table[@id='cart_summary']/tbody/tr[1]//a[@title='Delete']/i[@class='icon-trash']"));
        deleteFirstItemButton.click();


        driver.exit();
    }


}

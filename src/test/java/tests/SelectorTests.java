package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderPage;
import pages.SearchResultPage;
import utils.Driver;

public class SelectorTests extends BaseTest {

    //pages used
    private HomePage homePage;
    private SearchResultPage searchResultPage;
    private OrderPage orderPage;


    @BeforeMethod
    void beforeMethod() {
        homePage = new HomePage(Driver.getInstance().webDriver);
        searchResultPage = new SearchResultPage(Driver.getInstance().webDriver);
        orderPage = new OrderPage(Driver.getInstance().webDriver);
    }

    @Test
    public void firstTest() {
        homePage.openPage();
        homePage.checkForElementsToBeVisible();
    }

    @Test
    public void findDressTest() {
        //1. Navigate to http://automationpractice.com
        homePage.openPage();

        //2. Search for “dress”
        homePage.searchFor("dress");

        //3. Click on the first item on the page
        searchResultPage.clickFirstProduct();

        searchResultPage.waitForFrameModalToAppear();
        searchResultPage.switchToFrameModal();

        //4. Add to cart
        searchResultPage.clickAddToCartButton();
    }

    @Test
    public void changeDressAttributesTest() {
        //1. Navigate to http://automationpractice.com
        homePage.openPage();

        //2. Search for “dress”
        homePage.searchFor("dress");

        //3. Click on the second item on the page
        searchResultPage.clickSecondProduct();

        searchResultPage.waitForFrameModalToAppear();
        searchResultPage.switchToFrameModal();

        //4. Change size
        searchResultPage.setQuantityTo("2");

        //5. Change color
        searchResultPage.clickColorPink();

        //6. Add to cart
        searchResultPage.clickAddToCartButton();
    }

    @Test
    public void checkoutDeleteFlowTest() {
        //1. Navigate to http://automationpractice.com
        homePage.openPage();

        //2. Search for “dress”
        homePage.searchFor("dress");

        //3. Click on any item on the page
        searchResultPage.clickSecondProduct();

        searchResultPage.waitForFrameModalToAppear();
        searchResultPage.switchToFrameModal();

        //4. Change size and quantity
        searchResultPage.setQuantityTo("2");
        //searchResultPage.selectSizeNr(1); //not working at the moment, I don't know why

        //5. Change color if possible
        if (searchResultPage.colorPinkExits() != 0) {
            searchResultPage.clickColorPink();
        }

        //6. Add to cart
        searchResultPage.clickAddToCartButton();

        //7. Click Proceed to checkout
        searchResultPage.waitForLayerCartToAppear();
        searchResultPage.clickProceedToCheckoutButton();

        //8. Delete the product
        orderPage.waitForCartTitleToAppear();
        orderPage.clickDeleteFirstItemButton();
    }

/*

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

 */
}

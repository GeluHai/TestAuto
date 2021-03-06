package tests;

import org.testng.annotations.AfterMethod;
import pages.*;
import utils.Driver;

public class BaseTest {

    public HomePage homePage;
    public SearchResultPage searchResultPage;
    public OrderPage orderPage;
    public QuickViewProductPage quickViewProductPage;
    public LayerCartPage layerCartPage;

    public HomePage getHomePage() {
        return homePage = new HomePage(Driver.getInstance().webDriver);
    }

    public SearchResultPage getSearchResultPage() {
        return searchResultPage = new SearchResultPage(Driver.getInstance().webDriver);
    }

    public OrderPage getOrderPage() {
        return orderPage = new OrderPage(Driver.getInstance().webDriver);
    }

    public QuickViewProductPage getQuickViewProductPage() {
        return quickViewProductPage = new QuickViewProductPage(Driver.getInstance().webDriver);
    }

    public LayerCartPage getLayerCartPage() {
        return layerCartPage = new LayerCartPage(Driver.getInstance().webDriver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownClass() {
        if (Driver.getInstance() != null) {
            Driver.exit();
        }
    }
}

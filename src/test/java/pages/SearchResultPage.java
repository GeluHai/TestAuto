package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static utils.Driver.webDriver;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//div[@id='center_column']/ul/li[1]")
    protected WebElement firstProduct;

    @FindBy(xpath = "//iframe[@class='fancybox-iframe']")
    protected WebElement iFrameModal;

    @FindBy(xpath = "//p[@id='add_to_cart']/button[@name='Submit']")
    protected WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='center_column']/ul/li[2]")
    protected WebElement secondProduct;

    @FindBy(id = "quantity_wanted")
    protected WebElement quantityField;

    @FindBy(id = "color_24")
    protected WebElement colorPink;

    @FindBy(id = "group_1")
    protected Select sizeDropDown;

    @FindBy(id = "layer_cart")
    protected WebElement layerCart;

    @FindBy(xpath = "//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")
    protected WebElement proceedToCheckoutButton;


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstProduct(){
        firstProduct.click();
    }

    public void waitForFrameModalToAppear(){
        BasePage.waitForElementToAppear(iFrameModal);
    }

    public void switchToFrameModal(){
        webDriver.switchTo().frame(iFrameModal);
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void clickSecondProduct(){
        secondProduct.click();
    }

    public void setQuantityTo(String quantityToSet){
        quantityField.sendKeys(quantityToSet);
    }

    public void clickColorPink(){
        colorPink.click();
    }

    public void selectSizeNr(int indexOfSize){
        sizeDropDown.selectByIndex(indexOfSize);
    }

    public int colorPinkExits(){
        return webDriver.findElements(By.id("color_24")).size();   //need a better method
    }

    public void waitForLayerCartToAppear(){
        BasePage.waitForElementToAppear(layerCart);
    }

    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
}

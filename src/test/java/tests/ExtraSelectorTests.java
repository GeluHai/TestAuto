package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;

public class ExtraSelectorTests {

    public static Driver driver = null;
    String baseUrl = "https://www.seleniumeasy.com/test/";

    //to do


    //1. On the Input Forms section - checkbox demo:
    // build a single selector for the 4 options that allows you to choose between them using a parameter.
    // Check all options and search for an element that tells you all options are checked
    @Test
    public void checkboxDemoTest() {
        driver = Driver.getInstance();
        driver.navigate(baseUrl + "basic-checkbox-demo.html");

        checkboxOption("1").click();
        checkboxOption("2").click();
        checkboxOption("3").click();
        checkboxOption("4").click();

        WebElement checkAll = driver.webDriver.findElementById("isChkd");

        if (checkAll.getAttribute("value").equals("true")) {
            System.out.println("All options are checked");
        } else
            System.out.println("NOT all options are checked");

        driver.exit();
    }

    public WebElement checkboxOption(String optionNumber) {
        WebElement checkboxOptions = driver.webDriver.findElementByCssSelector("div:nth-of-type(" + optionNumber + ") > label > .cb1-element");
        return checkboxOptions;
    }


    //2. On the Date pickers section - JQuery date picker,
    // build selectors for one of the fields that allows you to pick a date
    @Test
    public void datePickerTest() {
        driver = Driver.getInstance();
        driver.navigate(baseUrl + "jquery-date-picker-demo.html");

        WebElement fromField = driver.webDriver.findElementById("from");
        fromField.click();

        WebElement selectDate = driver.webDriver.findElementByXPath("//div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]/a[@href='#']");
        selectDate.click();

        driver.exit();
    }

    //3. On the  Table section - table data search:
    // build a single selector that can get all the elements rows
    @Test
    public void tableTest() {
        driver = Driver.getInstance();
        driver.navigate(baseUrl + "table-search-filter-demo.html");

        List<WebElement> rows = driver.webDriver.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.print("\n");
        }

        driver.exit();
    }

    //4. On the same section for the bottom table get the state of the filters buttons,
    // click filter then get the state again
    @Test
    public void tableFilterTest() {
        driver = Driver.getInstance();
        driver.navigate(baseUrl + "table-search-filter-demo.html");

        // I have no idea

        driver.exit();
    }

    //5. On the Alerts & Modals section - Bootstrap Modal:
    // launch the single modal example,
    // build a selector for the x button,
    // close the modal,
    // check if the button is still displayed,
    // what about present?
    @Test
    public void bootstrapModalTest() {
        driver = Driver.getInstance();
        driver.navigate(baseUrl + "bootstrap-modal-demo.html");

        WebElement launchSingleModal = driver.webDriver.findElementByXPath("/html//div[@class='container-fluid text-center']/div[@class='row']/div[@class='col-md-6 text-left']//a[@href='#myModal0']");
        launchSingleModal.click();

        driver.waitForElementToAppear(By.className("modal-content"));
        WebElement dismissButton = driver.webDriver.findElementByXPath("//*[@id=\"myModal0\"]/div/div/div[1]/button");
        dismissButton.click();

        if (dismissButton.isDisplayed()) {
            System.out.println("The button is still displayed");
        } else
            System.out.println("The button is NOT displayed");

        driver.exit();
    }

    //6. On the List Box section: JQuery list box:
    // add two values from the left list (only one selector for all values) to the right box,
    // make sure the value is in the second field (the fields have different selectors)
    // then remove one of the added values
    @Test
    public void listBoxSectionTest() {
        driver = Driver.getInstance();
        driver.navigate(baseUrl + "jquery-dual-list-box-demo.html");

        WebElement addButton = driver.webDriver.findElementByXPath("//div[@id='pickList']//button[.='Add']");
        WebElement removeButton = driver.webDriver.findElementByXPath("/html//div[@id='pickList']//button[.='Remove']");

        listPick("2").click();
        addButton.click();
        listPick("5").click();
        addButton.click();

        driver.webDriver.findElementByXPath("//div[@id='pickList']/div/div[3]/select/option[.='Sophia']").isDisplayed();
        driver.webDriver.findElementByXPath("//div[@id='pickList']/div/div[3]/select/option[.='Manuela']").isDisplayed();

        listPick("2").click();
        removeButton.click();

        driver.exit();
    }

    public WebElement listPick(String listIndex) {
        WebElement listWithElements = driver.webDriver.findElementByCssSelector("[data-id='" + listIndex + "']");
        return listWithElements;
    }

}

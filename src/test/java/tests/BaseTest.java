package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;

public class BaseTest {

    @BeforeMethod()


    @AfterMethod(alwaysRun = true)
    public void tearDownClass() {
        if (Driver.getInstance() != null) {
            Driver.exit();
        }
    }
}

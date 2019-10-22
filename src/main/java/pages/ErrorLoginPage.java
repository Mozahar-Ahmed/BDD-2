package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ErrorLoginPage {
    @FindBy(xpath = "//div[@role='alert']")
    WebElement errorMessage;

    public void validateAlertIsDisplayed() {
        Assert.assertEquals(errorMessage.isDisplayed(), true, "Error message isn't displayed");
    }
}

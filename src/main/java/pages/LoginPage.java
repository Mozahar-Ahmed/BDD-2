package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
    @FindBy(xpath = "//i[@class='fb_logo img sp_lFwffOkkE26 sx_46e267']")
    WebElement facebookLogo;


    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    public void homepageIsDisplayed() {
        Assert.assertEquals(facebookLogo.isDisplayed(), true, "facebook page wasn't displayed");
    }

    public void emailIsDisplayed() {
        Assert.assertEquals(emailField.isDisplayed(), true, "email field wasn't displayed");
    }
}

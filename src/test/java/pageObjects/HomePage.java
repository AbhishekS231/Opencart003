
package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.//span[normalize-space()='My Account']]")
    WebElement lnkMyaccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement lnkRegister;

    @FindBy(linkText = "Login")
    WebElement linkLogin;

    public void clickMyAccount() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        By myAccountLink = By.xpath(
                "//a[.//span[normalize-space()='My Account']]"
        );

        wait.until(
                ExpectedConditions.elementToBeClickable(myAccountLink)
        ).click();
    }

    public void clickRegister() {
        lnkRegister.click();
    }

    public void clickLogin() {
        linkLogin.click();
    }
}

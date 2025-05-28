package pages;

import locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    LoginPageLocators locators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        locators = new LoginPageLocators();
        PageFactory.initElements(driver, locators);
    }

    public void login(String username, String password) {
        locators.userNameField.clear();
        locators.userNameField.sendKeys(username);
        locators.passwordField.clear();
        locators.passwordField.sendKeys(password);
        locators.loginButton.click();
    }

    public String getErrorMessage() {
        // Tunggu maksimal 5 detik sampai elemen error terlihat
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(locators.errorMessage));
        return locators.errorMessage.getText();
    }
}

package pages;

import locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    LoginPageLocators locators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        locators = new LoginPageLocators();
        PageFactory.initElements(driver, locators);
    }

    public void login(String username, String password) {
        locators.userNameField.sendKeys(username);
        locators.passwordField.sendKeys(password);
        locators.loginButton.click();
    }

    public String getErrorMessage() {
        return locators.errorMessage.getText();
    }
}

package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy(name = "username")
    public WebElement userNameField;

    @FindBy(name = "password")
    public WebElement passwordField;


    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div/p")
    public WebElement errorMessage;
}

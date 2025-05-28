package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    // Locator input username berdasarkan atribut name
    @FindBy(name = "username")
    public WebElement userNameField;

    // Locator input password berdasarkan atribut name
    @FindBy(name = "password")
    public WebElement passwordField;

    // Tombol login dengan XPath seperti yang kamu punya
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    // Pesan error login dengan XPath seperti yang kamu punya
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div/p")
    public WebElement errorMessage;
}

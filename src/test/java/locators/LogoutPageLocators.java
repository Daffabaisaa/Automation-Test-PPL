package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPageLocators {

    // Tombol logout
    @FindBy(xpath = "//button[.//*[local-name()='svg' and contains(@class, 'lucide-log-out')]]")
    public WebElement logoutButton;

    // Tombol "Ya" pada popup konfirmasi logout
    @FindBy(xpath = "//button[text()='Ya']")
    public WebElement yesButton;
}

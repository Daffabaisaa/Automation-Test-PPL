package pages;

import locators.LogoutPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {
    WebDriver driver;
    LogoutPageLocators locators;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        locators = new LogoutPageLocators();
        PageFactory.initElements(driver, locators);
    }

    public void clickLogoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(locators.logoutButton)).click();
    }

    public void confirmLogout(String pilihan) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (pilihan.equalsIgnoreCase("ya")) {
            wait.until(ExpectedConditions.visibilityOf(locators.yesButton)).click();
        }
    }

    public boolean isAtLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.urlContains("login")); // Ganti jika URL login bukan mengandung "login"
    }
}

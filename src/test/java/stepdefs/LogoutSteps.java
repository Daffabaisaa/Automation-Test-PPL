package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LogoutPage;

import static org.junit.Assert.assertTrue;

public class LogoutSteps {

    WebDriver driver;
    LoginPage loginPage;
    LogoutPage logoutPage;

    @Given("user telah login sebagai {string} dengan password {string}")
    public void user_telah_login(String username, String password) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("http://ptbsp.ddns.net:6882/");
        loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        logoutPage = new LogoutPage(driver);
    }

    @When("user mengklik tombol logout")
    public void user_mengklik_tombol_logout() {
        logoutPage.clickLogoutButton();
    }

    @And("user mengonfirmasi logout dengan memilih {string}")
    public void user_mengonfirmasi_logout_dengan_memilih(String pilihan) {
        logoutPage.confirmLogout(pilihan);
    }

    @Then("user diarahkan ke halaman login")
    public void user_diarahkan_ke_halaman_login() {
        boolean isAtLoginPage = logoutPage.isAtLoginPage();
        assertTrue(isAtLoginPage);
        driver.quit();
    }
}

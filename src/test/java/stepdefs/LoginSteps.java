package stepdefs;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("User sudah membuka web browser")
    public void user_sudah_membuka_web_browser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        loginPage = new LoginPage(driver);
    }

    @And("User berada pada halaman login aplikasi Zaidan Educare School")
    public void user_berada_pada_halaman_login_aplikasi() {
        driver.get("http://ptbsp.ddns.net:6882/");
    }

    @When("user memasukkan username {string} dan password {string}")
    public void user_memasukkan_username_dan_password(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("User dapat melihat pesan {string}")
    public void user_dapat_melihat_pesan(String expectedMessage) {
        String actual = loginPage.getErrorMessage();
        assertTrue(actual.toLowerCase().contains(expectedMessage.toLowerCase()));
        driver.quit();
    }
}
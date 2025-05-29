package stepdefs;

import actions.HomePageActions;
import helper.Helper;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
    HomePageActions homePageActions = new HomePageActions();

    @Given("User sudah membuka web browser")
    public void user_sudah_membuka_web_browser() {
        driver = Helper.getInstance().getDriver();
    }

    @And("User berada pada halaman login aplikasi Zaidan Educare School")
    public void user_berada_pada_halaman_login_aplikasi() {
        driver.get("http://ptbsp.ddns.net:6882/");
        loginPage = new LoginPage(driver);
    }

    @When("user memasukkan username {string} dan password {string}")
    public void user_memasukkan_username_dan_password(String username, String password) {
        loginPage.login(username, password);
    }

    @And("user menekan tombol login")
    public void user_menekan_tombol_login() {
        // sudah dilakukan di method login()
    }

    @And("user dapat melihat sidebar bendahara")
    public void user_dapat_melihat_sidebar_bendahara() {
        homePageActions = new HomePageActions();
        String[] expectedSidebarItems = {
            "Dasbor",
            "Tagihan Siswa",
            "Transaksi Penerimaan Dana",
            "Pengaturan Notifikasi",
            "Status Pembayaran",
            "Rekapitulasi",
            "Progres Transaksi Penerimaan Dana"
        };
        Assert.assertArrayEquals(expectedSidebarItems, homePageActions.getSidebarItems().toArray());
    }

    @Then("User dapat melihat pesan {string}")
    public void user_dapat_melihat_pesan(String expectedMessage) {
        String actual = loginPage.getErrorMessage();
        assertTrue(actual.toLowerCase().contains(expectedMessage.toLowerCase()));
        driver.quit();
    }

    @Then("user diarahkan ke halaman dashboard")
    public void user_diarahkan_ke_halaman_dashboard() {
        Assert.assertTrue(homePageActions.getHomePageText().contains("Dasbor - Bendahara"));
    }
}

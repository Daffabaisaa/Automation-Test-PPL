package helper;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Helper {

    private static Helper instance;
    private WebDriver driver;
    public final static int TIMEOUT = 10;

    private Helper() {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);

        ((JavascriptExecutor) driver).executeScript(
                "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
        );

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static Helper getInstance() {
        if (instance == null) {
            instance = new Helper();
        }
        return instance;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        instance = null;
    }
}
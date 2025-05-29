package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageLocators {

    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[1]/h1")
    public WebElement homePageName;

    @FindBy(xpath = "//ul[@data-sidebar='menu']/li/a/span")
    public List<WebElement> sidebarItems;
}

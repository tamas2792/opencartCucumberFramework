package pageObjects;

import io.netty.util.internal.logging.Slf4JLoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAccountPage extends BasePage {

    private static Logger logger = LoggerFactory.getLogger(MyAccountPage.class);

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text()='My Account']") // MyAccount Page heading
    WebElement msgHeading;

    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    WebElement lnkLogout;


    public boolean isMyAccountPageExists() {   // MyAccount Page heading display status
        logger.info("Verify if Page account exist? ");
        try {
            return (msgHeading.isDisplayed());
        } catch (Exception e) {
            return (false);
        }
    }

    public void clickLogout() {
        lnkLogout.click();
    }

}

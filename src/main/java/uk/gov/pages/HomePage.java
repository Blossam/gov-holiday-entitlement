package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Start now']")
    WebElement startNow;
    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;

    public void clickOnStartButton(){
        clickOnElement(startNow);
    }

    public void clickOnAcceptCookies(){
        clickOnElement(acceptCookies);
    }
}
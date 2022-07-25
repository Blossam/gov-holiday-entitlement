package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='gem-c-title__text govuk-heading-xl']")
    WebElement information;
    @CacheLookup
    @FindBy(css = "div[class='summary'] p")
    WebElement entitlement;

    public String verifyInformationOnYourAnswer(){
        log.info("Verifying Title " + information.toString());
        return getTextFromElement(information).trim();
    }
    public String verifyEntitlement(){
        log.info("Verify Title " + entitlement.toString());
        return getTextFromElement(entitlement).trim();
    }

}

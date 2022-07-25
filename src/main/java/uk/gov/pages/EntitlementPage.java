package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

import java.util.List;

public class EntitlementPage extends Utility {
    private static final Logger log = LogManager.getLogger(EntitlementPage.class.getName());

    public EntitlementPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[@class='govuk-fieldset__heading gem-c-radio__heading-text']")
    WebElement holidayTitle;
    @CacheLookup
    @FindBy(xpath = "//label[contains(@for,'response')]")
    List<WebElement> contractList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public String verifyTitle() {
        log.info("Getting Title " + holidayTitle.toString());
        return getTextFromElement(holidayTitle);
    }

    public void selectContractList(String contractType) {
        for (WebElement empCtype : contractList) {
            if (empCtype.getText().contains(contractType)) {
                clickOnElement(empCtype);
                log.info("Select Contract Type" + contractList.toString());
                break;
            }

        }
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}
package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

import java.util.List;

public class WorkOutHolidayPage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkOutHolidayPage.class.getName());

    public WorkOutHolidayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//h1[@class='govuk-fieldset__heading gem-c-radio__heading-text']")
    WebElement workOutTitle;
    @CacheLookup
    @FindBy(xpath = "//label[@class='gem-c-label govuk-label govuk-radios__label']")
    List<WebElement> workOutHolidayList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public String verifyHolidayTitle(){
        log.info("Verifying  Title " + workOutTitle.toString());
        return getTextFromElement(workOutTitle);
    }

    public void selectHolidayList(String workOutType){
        for (WebElement holidayType : workOutHolidayList){
            if(holidayType.getText().contains(workOutType)){
                clickOnElement(holidayType);
                log.info("Select Holiday Type" + workOutHolidayList);
                break;
            }
        }
    }
public void clickOnContinueButton(){
        clickOnElement(continueButton);
}
}

package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class PerWeekPage extends Utility {
    private static final Logger log = LogManager.getLogger(PerWeekPage.class.getName());

    public PerWeekPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@for='response']")
    WebElement workedPerDays;
    @CacheLookup
    @FindBy(id = "response")
    WebElement weekHours;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueHours;
    @CacheLookup
    @FindBy(xpath = "//label[@for='response']")
    WebElement daysPerWeek;
    @CacheLookup
    @FindBy(css= "#response")
    WebElement daysWorked;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueDays;


    public String verifyWorkedHoursPerWeek(){
        log.info("Getting Title " + workedPerDays.toString());
        return getTextFromElement(workedPerDays);
    }
public void enterHours(String hours){
        sendTextToElement(weekHours,hours);
        log.info("Enter weekly hours" + weekHours.toString());
    }
    public void clickOnContinueButton(){
        clickOnElement(continueHours);
        log.info("Click on continue button" + continueHours.toString());

    }
    public String verifyWorkedDayPerWeek(){
        log.info("Verifying Title " + daysPerWeek.toString());
        return getTextFromElement(daysPerWeek);
    }
    public void enterDays(String days){
        sendTextToElement(daysWorked,days);
        log.info("Enter days" + daysWorked.toString());
    }
    public void clickOnContinueTab(){
        clickOnElement(continueDays);
        log.info("Click on continue tab " + continueDays.toString());
    }
}

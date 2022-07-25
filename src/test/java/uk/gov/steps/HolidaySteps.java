package uk.gov.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.gov.pages.*;

public class HolidaySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on Accept additional cookies$")
    public void iClickOnAcceptAdditionalCookies() {
        new HomePage().clickOnAcceptCookies();
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {
        new HomePage().clickOnStartButton();
    }

    @And("^I verify the title as \"([^\"]*)\"$")
    public void iVerifyTheTitleAs(String enTitleMent) {
        String expectedMessage = enTitleMent;
        String actualMessage = new EntitlementPage().verifyTitle();
        Assert.assertEquals("Message is not displayed", expectedMessage, actualMessage);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String ecType) {
        new EntitlementPage().selectContractList(ecType);
    }

    @Then("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new EntitlementPage().clickOnContinueButton();
    }

    @Then("^I verify the work out holiday title as \"([^\"]*)\"$")
    public void iVerifyTheWorkOutHolidayTitleAs(String workOutTitle) {
    String expected = workOutTitle;
    String actual = new WorkOutHolidayPage().verifyHolidayTitle();
    Assert.assertEquals("Title is not displayed ", expected,actual);
    }

    @And("^I select option as \"([^\"]*)\"$")
    public void iSelectOptionAs(String workType) {
        new WorkOutHolidayPage().selectHolidayList(workType);
    }

    @Then("^I click on Continue button for next page$")
    public void iClickOnContinueButtonForNextPage() {
        new WorkOutHolidayPage().clickOnContinueButton();
    }


    @Then("^I verify the title number of hours per week \"([^\"]*)\"$")
    public void iVerifyTheTitleNumberOfPerWeek(String hoursTitle)  {
        String expectedTitle = hoursTitle;
        String actual = new PerWeekPage().verifyWorkedHoursPerWeek();
        Assert.assertEquals("Title is not correct",expectedTitle,actual);
    }


    @Then("^I enter hours worked per week \"([^\"]*)\"$")
    public void iEnterHoursWorkedPerWeek(String hour)  {
        new PerWeekPage().enterHours(hour);
    }

    @And("^I click on Continue to go next page$")
    public void iClickOnContinueToGoNextPage() {
        new PerWeekPage().clickOnContinueButton();

    }

    @Then("^I verify the title number of days worked \"([^\"]*)\"$")
    public void iVerifyTheTitleNumberOfDaysWorked(String dayTitle)  {
        String expectedMessage = dayTitle;
        String actual = new PerWeekPage().verifyWorkedDayPerWeek();
        Assert.assertEquals("Title not correct",expectedMessage,actual);
    }

    @Then("^I enter number of days \"([^\"]*)\"$")
    public void iEnterNumberOfDays(String days)  {
        new PerWeekPage().enterDays(days);
    }

    @And("^I click on Continue to see the result$")
    public void iClickOnContinueToSeeTheResult() {
        new PerWeekPage().clickOnContinueTab();
    }

    @Then("^I verify the information title and result \"([^\"]*)\"$")
    public void iVerifyTheInformationTitleAndResult(String information)  {
        String expectedMessage = information;
        String actual = new ResultPage().verifyInformationOnYourAnswer();

        Assert.assertTrue("Title is not matched",actual.contains(expectedMessage));

    }

    @And("^I verify the entitlement \"([^\"]*)\"$")
    public void iVerifyTheEntitlement(String entitlement)  {
        String expected = entitlement;
        String actual = new ResultPage().verifyEntitlement();
        System.out.println(actual);
        Assert.assertEquals("Title not correct ",expected,actual);
    }
}


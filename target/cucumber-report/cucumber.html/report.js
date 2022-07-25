$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CalculateHoliday.feature");
formatter.feature({
  "line": 2,
  "name": "Calculate holiday entitlement",
  "description": "\r\nAs user I want to logging into Government Holiday website",
  "id": "calculate-holiday-entitlement",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3746973600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Calculate holiday entitlement",
  "description": "",
  "id": "calculate-holiday-entitlement;calculate-holiday-entitlement",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Accept additional cookies",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify the title as \"Is the holiday entitlement based on:\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \"hours worked per week\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I verify the work out holiday title as \"Do you want to work out holiday:\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select option as \"for a full leave year\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on Continue button for next page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I verify the title number of hours per week \"Number of hours worked per week?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter hours worked per week \"37.5\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I click on Continue to go next page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify the title number of days worked \"Number of days worked per week?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I enter number of days \"5\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I click on Continue to see the result",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify the information title and result \"Information based on your answers\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I verify the entitlement \"The statutory entitlement is 210 hours holiday.\"",
  "keyword": "And "
});
formatter.match({
  "location": "HolidaySteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 70317000,
  "status": "passed"
});
formatter.match({
  "location": "HolidaySteps.iClickOnAcceptAdditionalCookies()"
});
formatter.result({
  "duration": 57475500,
  "status": "passed"
});
formatter.match({
  "location": "HolidaySteps.iClickOnStartButton()"
});
formatter.result({
  "duration": 162256300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Is the holiday entitlement based on:",
      "offset": 23
    }
  ],
  "location": "HolidaySteps.iVerifyTheTitleAs(String)"
});
formatter.result({
  "duration": 34845200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hours worked per week",
      "offset": 12
    }
  ],
  "location": "HolidaySteps.iClickOn(String)"
});
formatter.result({
  "duration": 64820100,
  "status": "passed"
});
formatter.match({
  "location": "HolidaySteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 145578500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Do you want to work out holiday:",
      "offset": 40
    }
  ],
  "location": "HolidaySteps.iVerifyTheWorkOutHolidayTitleAs(String)"
});
formatter.result({
  "duration": 27419800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "for a full leave year",
      "offset": 20
    }
  ],
  "location": "HolidaySteps.iSelectOptionAs(String)"
});
formatter.result({
  "duration": 47156400,
  "status": "passed"
});
formatter.match({
  "location": "HolidaySteps.iClickOnContinueButtonForNextPage()"
});
formatter.result({
  "duration": 132657400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number of hours worked per week?",
      "offset": 45
    }
  ],
  "location": "HolidaySteps.iVerifyTheTitleNumberOfPerWeek(String)"
});
formatter.result({
  "duration": 29035800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "37.5",
      "offset": 31
    }
  ],
  "location": "HolidaySteps.iEnterHoursWorkedPerWeek(String)"
});
formatter.result({
  "duration": 53046800,
  "status": "passed"
});
formatter.match({
  "location": "HolidaySteps.iClickOnContinueToGoNextPage()"
});
formatter.result({
  "duration": 234092000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number of days worked per week?",
      "offset": 42
    }
  ],
  "location": "HolidaySteps.iVerifyTheTitleNumberOfDaysWorked(String)"
});
formatter.result({
  "duration": 28610400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "HolidaySteps.iEnterNumberOfDays(String)"
});
formatter.result({
  "duration": 41299300,
  "status": "passed"
});
formatter.match({
  "location": "HolidaySteps.iClickOnContinueToSeeTheResult()"
});
formatter.result({
  "duration": 1080176900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Information based on your answers",
      "offset": 43
    }
  ],
  "location": "HolidaySteps.iVerifyTheInformationTitleAndResult(String)"
});
formatter.result({
  "duration": 30762700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The statutory entitlement is 210 hours holiday.",
      "offset": 26
    }
  ],
  "location": "HolidaySteps.iVerifyTheEntitlement(String)"
});
formatter.result({
  "duration": 19996700,
  "status": "passed"
});
formatter.after({
  "duration": 722553500,
  "status": "passed"
});
});
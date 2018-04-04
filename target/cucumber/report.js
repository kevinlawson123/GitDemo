$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/loginfile.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "In order to ensure login functionality works\r\nAs a QA\r\nI want to run the cucumber test to verify if it is working",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "user navigates to www.gcrit.com/build/admin3",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user logs in with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "home page should be displayed",
  "keyword": "Then "
});
});
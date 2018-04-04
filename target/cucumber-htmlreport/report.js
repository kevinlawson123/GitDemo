$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/dailyroutine.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Functionality",
  "description": "",
  "id": "facebook-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test login functionality with valid credentials.",
  "description": "",
  "id": "facebook-functionality;test-login-functionality-with-valid-credentials.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open firefox and enter the facebook URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should able to login successfully.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
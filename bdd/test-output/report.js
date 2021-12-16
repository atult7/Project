$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/UserReg.feature");
formatter.feature({
  "name": "NewuserReg",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful registration of new user with valid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User opens URL \"http://practice.automationtesting.in/my-account/\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters Email as \"sender01to@gmail.com\" and Password as \"Sender@4321\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on Register",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
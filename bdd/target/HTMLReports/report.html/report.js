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
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://practice.automationtesting.in/my-account/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"sender01togo@outlook.com\" and Password as \"SenDeR5@432@178@9\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Register",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Register()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login of new user with valid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL \"http://practice.automationtesting.in/my-account/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_open_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Input Email as \"sender01togo@outlook.com\" and Password as \"SenDeR5@432@178@9\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Input_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
});
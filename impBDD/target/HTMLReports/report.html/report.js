$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
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
  "name": "User opens URL \"https://outlook.office.com/mail/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"sender01togo@outlook.com\" and click next",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_as_and_click_next(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password as \"Sender@4321\" and click next",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Password_as_and_click_next(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Signin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Composing mail with valid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://outlook.office.com/mail/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Email as \"sender01togo@outlook.com\" and click next",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Enters_Email_as_and_click_next(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enters Password as \"Sender@4321\" and click next",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Enters_Password_as_and_click_next(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Signin",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_the_Signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on New Message",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Click_on_New_Message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the mail",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_the_mail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on send",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_send()"
});
formatter.result({
  "status": "passed"
});
});
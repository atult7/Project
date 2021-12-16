Feature: Login

  Scenario: Successful registration of new user with valid credential
    Given User Launch Chrome Browser
    When User opens URL "https://outlook.office.com/mail/"
    And User enters Email as "sender01togo@outlook.com" and click next
    And user enters Password as "Sender@4321" and click next
    Then Click on Signin

  Scenario: Composing mail with valid credential
    Given User launch Chrome Browser
    When User Opens URL "https://outlook.office.com/mail/"
    When User Enters Email as "sender01togo@outlook.com" and click next
    When user Enters Password as "Sender@4321" and click next
    And Click the Signin
    And User Click on New Message
    And Enter the mail
    Then Click on send
  

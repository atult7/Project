Feature: NewuserReg

  Scenario: Successful registration of new user with valid credential
    Given User Launch Chrome Browser
    When User opens URL "http://practice.automationtesting.in/my-account/"
    And User enters Email as "sender01togo@outlook.com" and Password as "SenDeR5@432@178@9"
    Then Click on Register

  Scenario: Successful login of new user with valid credential
    Given User Launch chrome Browser
    When User open URL "http://practice.automationtesting.in/my-account/"
    And User Input Email as "sender01togo@outlook.com" and Password as "SenDeR5@432@178@9"
    Then Click on Login

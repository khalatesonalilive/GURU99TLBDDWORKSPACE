Feature: Test GURU99 Application

  Scenario: validate the Contact Information
    Given user is on RegisterPage and validate the registerPage URL
    And user enter valid Firstname, Lastname, Phonenumber and email

  Scenario: validate Mailing Information
    Given user enters valid address, city , state,postal code and country

  Scenario: validate User Information
    When user enters valid username, password, confirmpassword and click on submit button

  Scenario: validate signinPage
    When user click on Signin link

  Scenario: validate Sign on page
    When user enters valid username, password and click on submit button

  Scenario: validate Login Success Page
    When user validate login success page text and url

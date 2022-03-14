Feature:  Login to nop commerce
  As a user
  i want to login to the application
  so that i can place some orders

  @login
  Scenario: Verify login with valid credentials

    Given i am on the nop commerce home page
    When  i click on login link on the nav bar
    Then  i should be navigated to login page
    When  i enter email as "milan1@test.com"
    And  i enter password as "Testing123"
    And  i click on login button
    Then  i should be logged in successfully



Feature:  Login to nop commerce
  As a user
  i want to login to the application
  so that i can place some orders

  @ui  @sanity
  Scenario Outline: Verify login with valid credentials

    Given i am on the nop commerce home page
    When  i click on login link on the nav bar
    Then  i should be navigated to login page
    When  i enter email as "<email>"
    And  i enter password as "<password>"
    And  i click on login button
    Then  i should be logged in successfully

    Examples:

      | ema il         | password |
      | user1@nop.com | testing1 |
      | user2@nop.com | testing2 |
      | user3@nop.com | testing3 |


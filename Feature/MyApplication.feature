Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid Username "<username>" and valid Password "<password>"
    Then user should be able to login successfully
    Then application should be closed

    Examples: 
      | username            | password  |
      | Sumitraj@gmail.com  | password1 |
      | Sumitraj2@gmail.com | password2 |
      | Sumitraj3@gmail.com | password3 |

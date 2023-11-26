Feature: Application login
  Scenario: Home page default login
    Given User is on Netbanking landing page
    When user logins into application with user name "dpk" and password "pwd123"
    Then Home page is populated
    And cards are displayed
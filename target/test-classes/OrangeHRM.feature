Feature: OrangeHRM

  Scenario: Validate usernames in descending order

    Given the user navigates to url
    When user enter credentials
    * user click the Admin function
    Then click the first check box next to the Username
    * validate that all the checkboxes are selected
    Then user click on top of Username two times
    And validate usernames are listed in descending order

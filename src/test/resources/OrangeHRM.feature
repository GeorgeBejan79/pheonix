Feature: OrangeHRM

  Background:
    Given the user navigates to url
    When user enter credentials


  Scenario: Validate usernames in descending order

    * user click the Admin function
    Then click the first check box next to the Username
    * validate that all the checkboxes are selected
    Then user click on top of Username two times
    And validate usernames are listed in descending order
    * user create a new record

    Scenario Outline:

      And the user select user role
      * select "<employee name>"
      * the user Enter "<username>"
      * the user Select status
      * the user Enter the "<password>" and "<confirm password>"
      * the user Click Save button
      * the user Validate "Successfully Saved" message
      Examples:
      |employee name|username|password|confirm password|
      |Kevin       | Hocine|Admin123|Admin123       |
      |Jadine      |Amirko    |Amirko123|Amirko123  |

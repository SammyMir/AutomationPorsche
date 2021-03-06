Feature: Home Page Functionalities

Background: Common step for all steps
  Given  user launches application

  @titletest
  Scenario: Validating Logo

    Given  user launches application
    When   user lands in home page and validate title "My Store"
    Then   user should see my store logo

  Scenario: Search Item


    And   user enters product "blouse"
    When  user clicks search icon
    Then  item "blouse" is displayed
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

    @contact
    Scenario: Contact Us Functionality
      And user clicks contact us button
      And user validates "CUSTOMER SERVICE - CONTACT US" is displayed
      And user chooses the subject heading "Customer service"
      And user enters email address
      And user enters order reference
      And user attaches file
      And user inputs message
      And user clicks send button
      Then success message "Your message has been successfully sent to our team." should be displayed

@account
  Scenario: Creating New User
    When user clicks sign in button
    Then user should see create user section
    And user enters valid email
    And clicks create button
    And user clicks title
    And user enters  firstname lastname and password
    And user selects date of birth
    And user enters valid company name
    And user enters address city
    And user enters address city
    And  user selects state and enters zipcode
    And  user enters mobile phone
    And  user click register button

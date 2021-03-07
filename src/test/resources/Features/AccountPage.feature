Feature: Account Page Features
  Scenario: Summer  Dress Selection
    Given user launches application
    And clicks sign in button
    And user enters valid email and password
    And user clicks sighin button
    And user moves cursor to DRESSES bar
    And user clicks SUMMER DRESSES
    And    user selects "Printed Summer Dress"
    And    user selects 2 dresses and "S" size and "blue"
    And    user adds into card
    Then   user validates sucess message "Product successfully added to your shopping cart"
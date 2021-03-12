@ACCOUNT
Feature: Account Page Features

  @dress
 Scenario: Summer  Dress Selection
#    Given user launches application
#    When user clicks sign in button
#    And user enters valid email and password
#    And user clicks submit button
#    And user moves cursor to DRESSES bar
#    And user clicks SUMMER DRESSES
#    And    user selects "Printed Summer Dress"
#    And    user selects 2 dresses and "S" size and "blue"
#    And    user adds into card
#    Then   user validates sucess message "Product successfully added to your shopping cart"


  Given  user launches application
    When   user clicks sign in button
    And    user enters valid email and password
    And    user clicks submit button
    And    user moves cursor to DRESSES bar
    And    user clicks SUMMER DRESSES
    And    user selects "Printed Summer Dress"
    And    user selects 2 dresses and "S" size and "blue"
    And    user adds into card
    Then user closes the application
    #Then   user validates sucess message "Product successfully added to your shopping cart"

  @buyItem
  Scenario: Buying the dresses
    Given user launches application
    When   user clicks sign in button
    And    user enters valid email and password
    And    user clicks submit button
    And    user moves cursor to DRESSES bar
    And    user clicks SUMMER DRESSES
    And    user selects "Printed Summer Dress"
    And    user selects 2 dresses and "S" size and "blue"
    And    user adds into card
    And    user clicks proceed to checkout
    And    user validates shopping cart page  "Your shopping cart contains: 2 Products"
    And    user validate dress name "Printed Summer Dress"
    Then   user validates products price "$57.96" and shipping cost "$2.00" and total cost "$59.96"
    And    user scrolls down to the bottom
    And    user clicks final checkout
    And    user is in Address section
    And    user validates that delivery and billing address are the same
    And    user clicks to go next section
    And    user valiate shipping fee "$2.00"
    And    user check terms and condito checkox
    And    user clicks proceed to checkbox for payment
    Then   user should in payment method section
    Then   user validated payment infomartion
    And    user click bank wire payment
    And    user is on bank wire payment section
    And    user click confirm button
    Then   user should see order confirmation "Your order on My Store is complete."
    Then user closes the application


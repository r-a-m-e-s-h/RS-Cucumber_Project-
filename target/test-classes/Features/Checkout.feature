Feature: Place order for the product

  @PlaceOrder
  Scenario Outline: place the item to Cart and proceed to checkout the product
    Given user is on GreenKart Landing Page
    When User Search the product with shortName <VegName> and extract the actual name of the product
    And Added "3" selected items of the product to cart
    Then User proceed to Checkout and validate the <Name> items in the checkout page
    And Verify User has ability to enter promocode and place the order

    Examples: 
      | VegName |
      | Tom  |
#|	Beet	|

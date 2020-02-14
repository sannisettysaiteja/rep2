Feature: Test me validation for the cart
@sanity
Scenario: user cross check for adding item in cart
Given Application launched by registered user for cart
Then user verifyin add item

@Regression
Scenario: user cross check for removing item in cart
Given Application launched by registered user for cart
Then user verifying remove item

@sanity @Regression
Scenario: user cross check for maximum count in cart
Given Application launched by registered user for cart
Then user verifies the max count of items in cart


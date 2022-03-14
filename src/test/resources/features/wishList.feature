Feature: Wishlist functionality is working or not?
@wishlist
  Scenario: To verify that Wishlist functionality is working or not?

    Given User should be on HomePage
    When user click on AddToWishlist for any product
    Then user should get confirmation msg as product The product has been added to your wishlist
    When user click on wishlist link
    Then user should be redirect on wishlist page
    And  product should be shown there


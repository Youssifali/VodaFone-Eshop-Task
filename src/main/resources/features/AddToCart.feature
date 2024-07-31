@smoke
Feature: AddToCart | user could select products and add them to cart

  Scenario Outline:
    Given user go to login page
    When user login with valid phoneNumber "<mobile>" and password "<pass>"
    And add first product to cart
    And add second product to cart
    Then search for product name "<productName>"
    Then add result product to cart
    Then go to cart page


    Examples:
      | mobile      | pass     | productName                         |
      | 01158840127 | Voda@123   | LG Smart TV 65-Inch UHD - 65UR801  |

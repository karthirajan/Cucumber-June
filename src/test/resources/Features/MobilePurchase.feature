#Author: karthi@your.domain.com
Feature: Mobile Purchase

  Background:
    Given User launches flipkart application
    And user able to login flipkart with credentials

  Scenario: Mobile
    When user search mobiles and choose
    And user add mobile to addToCart and doing payment
    Then user validates confirmation message

@Sanity @Smoke
  Scenario: Mobile list
    When user search mobiles and choose by one dim list
      | iPhone | SAMSUNG | realme |
    And user add mobile to addToCart and doing payment
    Then user validates confirmation message

  Scenario: Mobile map
    When user search mobiles and choose by one dim map
      | phone1 | iPhone  |
      | phone2 | realme  |
      | phone3 | SAMSUNG |
    And user add mobile to addToCart and doing payment
    Then user validates confirmation message

  Scenario Outline: 
    When user search mobiles and choose "<Phone>"
    And user add mobile to addToCart and doing payment
    Then user validates confirmation message

    Examples: 
      | Phone   |
      | iPhone  |
      | SAMSUNG |
      | realme  |

@All
Feature: Validate the Shopping Functionality of IKEA
Background: User should Launch Browser and Load the Url

@Regression
Scenario: Validate the Shopping Functionality by adding a prodruct to Cart
When User should should Click Products option from the page
And User should click Storage and organization from dropdown
And User should click Cabinets and Cupboards from options
And user should click Storage units and Cabinets
And user should click storage units and cabinets for home
And User should scrolldown and click the product
Then Use should click Add to Bag option
Then User should click continue to bag and click continue to checkout
Then User should click guest login
Then User should enter valid details in all fields

@Smoke
Scenario: Validate the search functionality of IKEA
When user should enter the Searchtext in Search Textbox
And User should select the item from the page

@Sanity
Scenario Outline: Validate the login functionality of IKEA
Given User Launch the Browser and Load the Url
When User enter the inValid username "<UserName>"and invalid password"<Password>"
And user should click continue button

Examples:
    |UserName|Password|
    |jayashreen8693@gmail.com |Jaiikea@8693|
    |sabari                   |sabari@123  |
    |jayashreen8693@gmail.com |12345       |

Feature: Login Feature
  @sanity
  Scenario: Successful login with valid credentials
    Given  user launch is on the login page
    When the user opens url "https://admin-demo.nopcommerce.com/login"
    And the user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    
    
    @regression
    Scenario Outline: login data driven
    Given  user launch is on the login page
    When the user opens url "https://admin-demo.nopcommerce.com/login"
    And the user enters email as "<email>" and password as "<password>"
    And click on login
    
    
    Examples:
    | email | password |
    | admin@yourstore.com | admin |
    | admin1@yourstore.com | admin123 |
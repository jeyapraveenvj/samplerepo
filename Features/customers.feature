Feature: customers

Background:Below steps are commonly used for each scenario
    Given user launch chrome browser
    When the user opens URL "https://admin-demo.nopcommerce.com/login"
    And the user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then User can view Dashboard

  Scenario: Add a new customer
    When User click on customers menu
    And click on customers menu item
    And click on Add new button
    Then user can view Add new customer page
    When user enter customer info
    And click on save button
    Then user can view confirmation message "The new customer has been added successfully"
    And Close browser
    
    
    //given-prerequisite
    //when-action/condition
    //then-representing output/outcome
    //and//check multiple output or continues of then
    
    
    //we can run through command 
    //download maven
    //select folder and paste in environmnt variables
    //copy and paste overall project location(Rc-properties)
    //nxt cmd-mvn clean install
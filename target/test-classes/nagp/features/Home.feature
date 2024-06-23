

Feature: Verify Homepage
  Description: Verify homepage of the application

  @Smoke @Home
  Scenario: Verify that user is able to see Welcome Message on HomePage
    When application is launched
    Then i should see the welcome message "Welcome!"
    
  
  @Smoke @Home
  Scenario: Verify the options present under OPTIONS
    When i click on OPTIONS
    Then i should see the following options 
    |SourceCode |
    |Rate App   |
    |Exit       |
    

    



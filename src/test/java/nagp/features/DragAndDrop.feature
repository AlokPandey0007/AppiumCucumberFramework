

Feature: Verify Drag and Drop
  Description: Verify Drag and Drop in AndroidUIDesign app

  @Regression @DragAndDrop
  Scenario: Verify that user is able to scroll till spefic country
    Given user is on drag and drop screen
    When user click on Sample DragDrop
    Then user should able to drag and drop
    And user should see drag element as focused after drag and drop 
    
  

    



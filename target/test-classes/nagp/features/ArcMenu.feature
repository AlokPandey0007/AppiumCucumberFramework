

Feature: Verify List View
  Description: Verify List View in AndroidUIDesign app


    
 @Regression @ArcMenu
  Scenario Outline: Verify that user is able to perform action on all arc menu
    Given user is on Arc Menu Screen
    When user click on Arc Menu button
    And user click on Android icon and then click on "<MenuItems>"
    Then user should see text "<MenuItems>"
    
    Examples:
    |MenuItems|
    |Twitter|
    |Camera|
    |Air|
    




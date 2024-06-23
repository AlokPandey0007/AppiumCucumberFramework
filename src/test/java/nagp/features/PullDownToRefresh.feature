

Feature: Verify Pull down to refresh functionality
  Description: Verify Pull down to refresh functionality

  @Smoke @PullToRefresh
  Scenario Outline: Verify that user is able to refresh and new item added to list if he perform pull down gesture
    Given user is on pull to refresh screen
    When user click on Pull to Refresh button 
   	And user perform swipe down gesture
    Then user should able to see new item with name "<ItemList>" in the list
  Examples:
  |ItemList|
  |NEW ITEM ADDED|
  |NEW ITEM ADDED|
  |NEW ITEM ADDED|

    
  

    



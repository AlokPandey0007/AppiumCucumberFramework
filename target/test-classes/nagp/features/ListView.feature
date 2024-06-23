

Feature: Verify List View
  Description: Verify List View in AndroidUIDesign app

    @Regression
  Scenario: Verify that user is able to scroll till spefic country
    Given user is on List View screen
    When user click on quick scrollbar
    Then user should see his "Zambia" country on scroll
    




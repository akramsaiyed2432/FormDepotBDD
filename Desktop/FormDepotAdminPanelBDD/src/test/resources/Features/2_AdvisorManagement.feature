Feature: Test Advisor management flow.

  @smoketest
  Scenario Outline: Test search functionality with firstname.
    Given User is on Advisor Management screen.
    And User enter <searchtext>  in searchbar and click on search button
    Then Appropriate search result as per the <searchtext> should be displayed.
		
    Examples: 
      | searchtext             |
      | TestRadix              |
      | Version                |
      | qatest2569@yopmail.com |
      | 23 Spark               |

  @smoketest
  Scenario Outline: Test Filter functionality.
    Given User is on Advisor Management screen.
    And User click on Filter icon
    And User selects FilterOption1
    And User click on Filter icon
    And User selects FilterOption2
    And User click on Filter icon
    And User selects FilterOption3
    Then Appropriate records should be displayed.

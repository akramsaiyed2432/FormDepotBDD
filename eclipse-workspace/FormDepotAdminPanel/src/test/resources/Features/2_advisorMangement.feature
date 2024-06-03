Feature: Test Advisor management flow.

  @smoketest
  Scenario Outline: Test search functionality with firstname.
    Given User is on Advisor Management screen.
    And User enter <searchtext>  in searchbar and click on search button
    Then Appropriate search result as per the <searchtext> should be displayed.

    Examples: 
      |searchtext|
      |TestRadix|
      |Version|
      |qatest2569@yopmail.com |
      |23 Spark|
     

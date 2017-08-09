@positive
Feature: Select Movie In IMDb

  Scenario Outline: User is able to navigate to movie from IMDb
    Given User opens browser 
    When User navigates to IMDb using <url>
    Then User is able to see IMDb homepage with title "IMDb"
    When User searches for movie <movie>
    Then User should see link to the movie
    When User clicks on the link to the movie
    Then User should be navigated to the movie with title <movie>
    
    Examples:
      |        url            |         movie          |
      | "http://www.imdb.com" | "Julie & Julia" |
      
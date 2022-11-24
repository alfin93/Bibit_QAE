Feature: Open book store
  Scenario: Question 2
    Given User go to page book store
    When User in “Book Store” page
    And User search book “qa engineer”
    Then User see “No rows found”
Feature: get book
  Scenario: Question 3
    Given User go to page book store
    When User in “Book Store” page
    And User search book “Git Pocket Guide”
    And User click book “Git Pocket Guide”
    Then User see “Git Pocket Guide”
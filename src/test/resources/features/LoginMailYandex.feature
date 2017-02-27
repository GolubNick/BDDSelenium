Feature: enter to yandex mailbox

Scenario: Java login to email
    Given I am on the Yandex homepage
    When I enter "" login
    When I enter "" password
    When I press submit button
    Then I should see my mailbox
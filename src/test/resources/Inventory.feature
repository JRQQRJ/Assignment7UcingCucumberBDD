Feature:   Add to cart functionality
  This feature validates add to cart functionality

  @sanity
  Scenario Outline: As a valid user, I want to add items to cart

    Given I am able to login

    When I want add "<item1>"  and "<item2>"to cart

    Then Items must be added to cart
    Examples:
      |item1|item2|
      |SauceLabsBackpack|SauceLabsFleeceJacket|




#  @smoke
#  Scenario Outline: As a invalid user, I should not be allowed to login to the application
#    Given I am at the login page
#    When  I enter "<username>" and "<password>" and try submit
#
#    Then  I should not see the Welcome Page
#    Examples:
#      | username | password |
#      | Tarun    | admin123 |

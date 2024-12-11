Feature: Login functionality cucumber

  Scenario Outline: Login case
    Given the user is on the homepage
    When user enters email
    And user enters password
    And user submit login
    Then verify login successfully

    Examples: Page titles
      | email                   | pass         |
      | trongtuyen451@gmail.com | Admin@123456 |
      | secondUser              | password2    |
      | thirdUser               | password3    |
      | fourthUser              | password4    |
    # @Ignore
    # Scenario: Login Failed
    #     Given the user is on the homepage
    #     When user enters email
    #     And user enters password
    #     Then verify login successfully

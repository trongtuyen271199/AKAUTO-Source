
Feature: Booking functionality

    Scenario: Login Successfully
        Given the user is on the homepage
        When user enters email
        And user enters password
        And user submit login
        Then verify login successfully
        And user input value seach product
        And usser click firt option
        And user click xuat xu
        And user click iconPlus
        And user click Add
       

    @Ignore
    Scenario: Login Failed
        Given the user is on the homepage
        When user enters email
        And user enters password
        Then verify login successfully

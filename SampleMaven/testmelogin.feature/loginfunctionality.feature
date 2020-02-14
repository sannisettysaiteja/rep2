Feature: demo webshop validations
Background: launch of demowebshop url
Given application is launched by the guest user

Scenario: Registrarion page validations
Given Application is launched
When user enters data for every mandatory field
And submits the application
Then verifies registration status


Scenario Outline: login validations
Given Application is launched
When user enters valid user name "<un>"
And user enters valid password   "<ps>" 
Then user submits the application
And verifies the login status



Examples:
|un| |ps|
|sai| |1234|
|teja| |6788|























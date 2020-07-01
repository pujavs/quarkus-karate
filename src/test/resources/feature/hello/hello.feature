Feature: Say Hello feature
Scenario: Testing the exact response of a GET endpoint
Given url helloUrl
When method GET
Then status 200
 And match $ == "Hello world!"
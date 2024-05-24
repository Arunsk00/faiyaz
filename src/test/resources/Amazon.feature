Feature: Verify the Amazon Webpage

Scenario Outline: Booking the selected Product

#Given User is on the Amazon webpage
When User should perform login "<username>" , "<password>"

Examples: 
          | username  |   password |   
          | 7402345219| Goodarun007|
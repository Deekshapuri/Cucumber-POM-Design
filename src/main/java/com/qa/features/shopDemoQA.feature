Feature: Shop Demo QA POM Feature

Scenario: Shop Demo QA Landing page scenario
Given Title of Home page is Shop Demo QA
Then User moves to login page

Scenario: Shop Demo QA Register scenario
Given Title of Register page is My Account
Then User enter register details username and email_address and password
Then User redirects

Scenario: Shop Demo QA Login scenario
Given Title of Login page is My Account
Then User enter login details username and password

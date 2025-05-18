Feature:
  Scenario:
    Given User is on Home Page page
    When clicks on the 'Contact Us' button
    And Full all data
    And accepts the alert
    Then  Verify success message 'Success! Your details have been submitted successfully.' is visible
    And   Click 'Home' button and verify that landed to home page successfully

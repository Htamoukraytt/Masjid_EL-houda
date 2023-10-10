@Regression
@Smoke
Feature:  Testing Home page features

  Background:
    Given user navigates to Masjid El Houda and validate 'Masjid Al Huda – Come together. Be together. Grow together.'


  Scenario Outline:  validating  main menu page feature components

    Then  user validates all menu options '<OPTION>' are displayed and clickable
    Examples:
      | OPTION      |
      | Summer-Camp |
      | Services    |
      | About       |
      | MultiMedia  |
      | Home        |



  Scenario:  validating major information are present in the main page

    When user validates the welcome message 'Welcome to Masjid Al Huda'

    And user validates salah info is displayed , 'Salaah Info'

    And  user registers in keep me informed feature

    Then user validates that registration was done successfully, 'The form was sent successfully.'











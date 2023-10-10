@Regression
Feature:  Testing About Us feature

  Background:
    Given user navigates to Masjid El Houda and validate 'Masjid Al Huda – Come together. Be together. Grow together.'

  Scenario: validating About Us components

    When  user clicks About Us feature

    And   user validates About Us page 'About – Masjid Al Huda'

    And   user validates stuff members are 15

    Then  user validates 'To contact the Board please email us at: board@masjidalhuda.org' , for contacting the To contact stuff


  @Smoke
  Scenario Outline:  validating social media competent are present and clickable

    When user validate 'Follow Us' is present

    And  user clicks social media type '<OPTION>' and validates '<URL>'

    Examples:
      | OPTION    | URL                                                      |
      | YouTube   | https://www.youtube.com/channel/UCp1Jcx0enRh8lV8dLTo0Elg |
      | Instagram | https://www.instagram.com/masjid_al_huda_schaumburg/     |
      | Facebook  | https://www.facebook.com/hudamasjid/                     |
      | WhatsApp  | https://chat.whatsapp.com/KHsKhzgkIki37TjbxlVnYv         |
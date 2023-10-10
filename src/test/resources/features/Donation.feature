@Regression
@Smoke
Feature:  Testing Donate feature

  Background:
    Given user navigates to Masjid El Houda and validate 'Masjid Al Huda – Come together. Be together. Grow together.'

  Scenario Outline:  validating Donate Feature and its component is working properly

    When user clicks donate

    And  user validates each type '<DonationType>' of donations is clickable and validates we are  the right page, '<URL>'

    Examples:
      | DonationType   | URL                                                          |
      | MasjidExpenses | https://donate.masjidalhuda.org/                             |
      | ZakatSadaqah   | https://donate.masjidalhuda.org/donations/general-donations/ |
      | MaktabNazirah  | https://donate.masjidalhuda.org/donations/maktab-nazirah/    |
      | TuitionFees    | https://tuition.alhudaacademy.com/                           |
      | Ramadan2023    | https://donate.masjidalhuda.org/category/ramadan/            |





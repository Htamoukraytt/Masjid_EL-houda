@Regression
Feature:  Testing Services Feature

  Background:
    Given user navigates to Masjid El Houda and validate 'Masjid Al Huda – Come together. Be together. Grow together.'


  Scenario Outline: Testing all options on the services feature are working properly

    When user clicks Services and validates is in the services page , 'Programs & Services'

    And  user clicks '<OPTION>' and validates '<URL>'


    Examples:
      | OPTION          | URL                                |
      | Zakat/Sadaqah   | https://masjidalhuda.org/zakat/    |
      | Janazah         | https://masjidalhuda.org/janazah/  |
      | Nikah           | https://masjidalhuda.org/nikah/    |
      | Advice          | https://masjidalhuda.org/advice/   |
      | Al Huda Academy | https://www.alhudaacademy.com/     |
      | Weekend School  | https://www.alhudasundayschool.org/ |
      | Maktab/Nazirah  | https://masjidalhuda.org/quran/    |
      | Outreach        | https://masjidalhuda.org/outreach/ |
#      | Newly Practicing |                                     |    // not available
#      | Adult Education  |                                     |   //  not available
#   +++  Weekend School  ---->  http://www.alhudasundayschool.org/






@Regression
Feature: Testing Summer Camp 2023 feature

  Background:
    Given user navigates to Masjid El Houda and validate 'Masjid Al Huda – Come together. Be together. Grow together.'


      Scenario:  validating users can reach the Summer Camp and register successfully

          When  user clicks Summer Camp 2023 and validates the page url , 'https://masjidalhuda.org/al-huda-summer-camp-2023/'

          And   user clicks register now

          Then  user  validates that can register for camp 'CAMP REGISTRATION IS NOW OPEN!'


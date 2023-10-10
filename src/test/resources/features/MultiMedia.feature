
@Regression
Feature:  Testing MultiMedia feature

     Background:
       Given user navigates to Masjid El Houda and validate 'Masjid Al Huda – Come together. Be together. Grow together.'

      Scenario:  validating MultiMedia is Displayed and clickable

           When  user clicks Multimedia

           And  user validates url , 'https://masjidalhuda.org/multimedia/'

           Then user validates Text 'Senior Americans were told to ask any question about ISLAM…And they did!'





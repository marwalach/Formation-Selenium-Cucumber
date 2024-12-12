@tag
Feature: Tunisair Search
  I want to do a search on tunisair website

  @tag2
  Scenario Outline: Tunisair Search
    Given open chrome
    And Get URL "https://www.tunisair.com/fr-tn"
    When choose VolsType "<VolType>"
    And choose Currency "<currency>"
    And click on DepartureVille and write "<Departville>"
    And click on ArrivalVille and write "<Arrivalville>"
    And click on calendar
    And choose Date début "<datedepart>"
    And choose Date Retour "<datederetour>"
    And click Valider la selection
    And click on PassengerNumber
    And choose "<NumberPassenger>"
    And click OK
    And click SeeVol
    Then I verify the Search

    Examples: 
      | VolType      | currency | Departville | Arrivalville | NumberPassenger | datedepart | datederetour |
      | Aller-retour | TND      | Paris       | Djerba       |               3 | 12-12-2024 | 02-01-2025   |
      | Aller simple | EUR      | Paris       | NICE         |               2 | 01-01-2025 | 20-01-2025   |

@tag
Feature: Recherche Google
  je veux chercher dans google en tant que admin

  @tag1
  Scenario: chercher google
    Given ouvrir navigateur
    And Saisir l'Url suivant "https://www.google.com/?hl=fr"
    When Taper le mot a chercher "Tunis"
    And Taper entrer
    Then verifier le mot "résultats" dans la page affiché


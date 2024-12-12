
@tag
Feature: Tester Paiement
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
    Given open le navigateur chrome
    And saisir lurl  "https://www.google.com/?hl=fr"
    When  Taper le mot a chercher "<Pays>" in step
    And Taper enter
    Then verifier le mot "<result>" in step

    Examples: 
      | Pays    | result | 
      | Tunis   | propos | 
      | Algerie | propos | 
      | France  | propos | 
      

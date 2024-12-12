
@tag
Feature: Authentification
  je veux m'authentifier en tant que admin

  @tag1
  Scenario: authentification page orange
  Given ouvrir navigateur chrome
  And ouvrir URL
  When Saisir Login
  And Saisir mot de passe
  And cliquer sur le bouton login
  Then verifier ouverture de page d'acceuil
  And verifier nom de profil
  

@CreationCompte
Feature: CreateAccount
  je veux Créer un compte fb en tant que admin

  @inscri
  Scenario: Create Fb Account
  Given ouvrir chrome
  And ouvrir URL FB
  When Saisir Prenom, Nom, day, month,year, gender, mail, password 
  And cliquer sur le bouton Submit
  Then verifier ouverture de page acceuil

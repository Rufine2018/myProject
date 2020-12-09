#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: My first User Story
  I want to use this template for my feature file

  @tag1
  Scenario: Les notes des étudiants
  
  En tant que Sécrétaire
  Je veux enregistrer les notes de chaque Etudiant afin ce faire
  Afin de calculer leurs moyennes 
  
  
  
    Given Une chaque matière suivi par un étudiant
    
    When L'étudiant a compose une matière
  
    Then then le matricule et la moyenne doivent etre automatiquement calculé 
 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
    Etudiant|Notes| value | Note |value|Moyenne|
   Etudiant1|Note1|  6    | Note2|10   |8
  
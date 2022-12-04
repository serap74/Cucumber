
@Wip
Feature: US1002 Kullanici ortak adimlari Background ile calistirir

  Background:
    Given  kullanici amazon ana sayfasinda

    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icin arama yapar
      Then sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

      Scenario: TC05 amazon java arama
        And kullanici Java icin arama yapar
        Then sonuclarin Java icerdigini test eder
        And  sayfayi kapatir
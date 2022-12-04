
@Tumu
Feature: Us1001 Kullanici Amazon Sayfasida arama yapar
  @Nutella, @ikisi
  Scenario:TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon ana sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
    @Java, @ikisi
  Scenario:TC02 kullanici amazonda Java aratir

    Given kullanici amazon ana sayfasinda
    Then kullanici Java icin arama yapar
      And sayfayi kapatir
    @iphone
    Scenario: TC03 kullanici iphone aratir
      When kullanici amazon ana sayfasinda
      And kullanici iphone icin arama yapar
      Then sonuclarin iphone icerdigini test eder
      And sayfayi kapatir
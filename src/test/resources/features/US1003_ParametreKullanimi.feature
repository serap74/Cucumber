@Parametre
  Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

    Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
      Given kullanici amazon ana sayfasinda
      And kullanici "Java" icin arama yapar
      And sonuclarin "Java" icerdigini test eder
      Then sayfayi kapatir
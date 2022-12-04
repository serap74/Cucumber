@hey
  Feature: US1004 kullanici parametre ile configuration file'i kullanabilmeli
    @Config
    Scenario: TC07 configuration properties dosyasindan parametre kullanimi

      Given kullanici "brcUrl" sayfasinda
      Then kullanici 3 sn bekler
      And url'i "blue" icerdigini test eder
      Then sayfayi kapatir
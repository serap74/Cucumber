package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utulities.ConfigReader;
import utulities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon ana sayfasinda")
    public void kullanici_amazon_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime="Nutella";
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);

    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime="Java";
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));

    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);

    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));
    }
    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys("istenenKelime" + Keys.ENTER);


    }
    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        String arananKelime="istenenKelime";
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));

    }

    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'i {string} icerdigini test eder")
    public void urlIIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

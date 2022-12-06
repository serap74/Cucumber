package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utulities.ConfigReader;

public class HotelMyCamp {
    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    @Then("Log in yazisini tiklar")
    public void log_in_yazisini_tiklar() {
        hotelMyCampPage.loginButonu.click();



    }
    @Then("geverli username girer")
    public void geverli_username_girer() {
        hotelMyCampPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HCMValidUsername"));

    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hotelMyCampPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HCMValidPassword"));

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hotelMyCampPage.loginButonu2.click();

    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hotelMyCampPage.hotelManagement.isDisplayed());

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hotelMyCampPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HCMWrongUsername"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hotelMyCampPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hotelMyCampPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HCMWrongUsername"));

    }

    @And("geverli password girer")
    public void geverliPasswordGirer() {
        hotelMyCampPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HCMValidPassword"));
    }

    @And("geversiz password girer")
    public void geversizPasswordGirer() {
        hotelMyCampPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HCMWrongUsername"));

    }


    @And("gecersiz username olarak{string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hotelMyCampPage.usernameKutusu.sendKeys(username);
    }

    @And("gecerli password olarak{string} girer")
    public void gecerliPasswordOlarakGirer(String password) {
        hotelMyCampPage.passwordKutusu.sendKeys(password);
    }
}

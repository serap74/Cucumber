package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@hey",
        dryRun =false

)

public class Runner {


    /*
    Bir frameworkde bir tek runner classi yeterli olabilir
    runner clasinda clas body sinde hic bir sey olmaz
    runner clasi onemli yapan iki notasyon vardir
    @RunWith(Cucumber.class) notasyonu runner clasina calisma ozellgi katar
    bu notasyon oldugu icin cucumber frameworkumuzde junit kullanmayi tercih ediyoruz

    features : runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue: stepdefinition dosyalarini nereden bulacagini tarif eder
    tags : o an hangi tagi calistirmak istiyorsak onu belli eder

    dryRun=true :testi calıstırmadan bize sadece eksik adimlari verir
    dryRun=false :testlerimizi calistirir
     */
}

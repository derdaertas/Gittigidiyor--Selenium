import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class GittigidiyorWebTest extends BaseTest
{

    @Test
    public void GittigidiyorWebEndtoEnd() throws InterruptedException {

        Logger logger = LogManager.getLogger(GittigidiyorWebTest.class);

        //5 sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //uyarı kapatılır
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.uyariGecAlan);
        logger.info("uyarı kapatılır");

        //5 sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //çerez uyarı kapat
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.cerezUyariKapat);
        logger.info("çerez uyarı kapatılır");

        //5 sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //arama alanına tıklanır
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.aramaAlani);
        logger.info("arama alanına tıklanır");

        //2sn bekletilir
        gittigidiyorWeb.waitSeconds(2);
        logger.info("2 sn bekletilir");

        //arama alanına bilgisayar yazılır
        gittigidiyorWeb.sendKeysToTheElement(gittigidiyorWeb.aramaAlani,"Bilgisayar");
        logger.info("arama alanına bilgisayar yazılır");

        //ara butonu tıklanır
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.aramaButonu);
        logger.info("ara butonu tıklanır");

        //5sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //Sayfa aşağı kaydırılır
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3850)");
        logger.info("Sayfa aşağı kaydırılır");

        //5sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //ikinci sayfaya geçilir
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.ikinciSayfaButon);
        logger.info("ikinci sayfaya geçilir");

        //5sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //ikinci sayfanın açıldığı doğrulanır
        gittigidiyorWeb.validateIsEquals(gittigidiyorWeb.ikinciSayfaUrl,gittigidiyorWeb.getUrlOfPage());
        logger.info("ikinci sayfanın açıldığı doğrulanır");

        //ürüne tıklanır ve ürün fiyatı alınır
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.urunGorsel);
        driver.get("https://www.gittigidiyor.com/masaustu-desktop-bilgisayar/turbox-atm900110_spp_914375?id=720115719");
        String urunTutari = driver.findElement(gittigidiyorWeb.urunTutari).getText();
        logger.info("ürüne tıklanır ve ürün fiyatı alınır");

        //5sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //ürün bilgileri dönülür
        gittigidiyorWeb.returnProductInfo(gittigidiyorWeb.urunTitle,gittigidiyorWeb.urunTutari);
        logger.info("ürün bilgileri dönülür");

        //ürün sepete eklenir
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.sepeteEkleButon);
        logger.info("ürün sepete eklenir");

        //2sn bekletilir
        gittigidiyorWeb.waitSeconds(2);
        logger.info("2sn bekletilir");

        //sepete gidilir
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.sepetGitButon);
        logger.info("sepete gidilir");

        //sayfadaki ve sepetteki ürün fiyatı karşılaştırılır
        gittigidiyorWeb.validateIsEquals(urunTutari,gittigidiyorWeb.getTextOfAnElement(gittigidiyorWeb.sepettekiUrunTutari));
        logger.info("sayfadaki ve sepetteki ürün fiyatı karşılaştırılır");

        //ürün adet alanı tıklanır
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.urunArtirmaAlani);
        logger.info("ürün adet alanı tıklanır");

        //ürün adeti 2 yapılır
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.urunSayisi2Buton);
        logger.info("ürün adeti 2 yapılır");

        //2sn bekletilir
        gittigidiyorWeb.waitSeconds(2);
        logger.info("2 sn bekletilir");

        //ürün adedinin 2 olduğu doğrulanır
        gittigidiyorWeb.validateIsEquals(gittigidiyorWeb.beklenenUrunAdedi,gittigidiyorWeb.getTextOfAnElement(gittigidiyorWeb.urunAdediAlani));
        logger.info("ürün adedinin 2 olduğu doğrulanır");

        //5sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");

        //ürün sepetten silinir
        gittigidiyorWeb.clickOnElement(gittigidiyorWeb.sepettenSilButon);
        logger.info("ürün sepetten silinir");

        //5sn bekletilir
        gittigidiyorWeb.waitSeconds(10);
        logger.info("5 sn bekletilir");

        //sepetin boş olduğu doğrulanır
        gittigidiyorWeb.validateIsEquals(gittigidiyorWeb.sepetBosYazi,gittigidiyorWeb.getTextOfAnElement(gittigidiyorWeb.bosSepetYaziAlani));
        logger.info("sepetin boş olduğu doğrulanır");

        //5sn bekletilir
        gittigidiyorWeb.waitSeconds(5);
        logger.info("5 sn bekletilir");
    }

    }


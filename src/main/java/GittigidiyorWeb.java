import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class GittigidiyorWeb {
    private WebDriver driver;

    public By aramaAlani = By.cssSelector("input[type='text']");

    public By aramaButonu = By.cssSelector("button[data-cy='search-find-button']");

    public By uyariGecAlan = By.cssSelector("div[class='wis_clsbtn']");

    public By cerezUyariKapat = By.cssSelector("a[class='tyj39b-5 lfsBU']");

    public By ikinciSayfaButon = By.cssSelector("a[title='2. sayfa']");

    public By urunTitle = By.id("sp-title");

    public By urunTutari = By.id("sp-price-highPrice");

    public By urunGorsel = By.cssSelector("img[class='sc-1o6eogh-0 i3yadh-0 gmgqoT sc-1n49x8z-9 sc-1cpkc3l-4 jVhkOY egaQmn']");

    public String ikinciSayfaUrl = "https://www.gittigidiyor.com/arama?k=Bilgisayar&sf=2";

    public By sepeteEkleButon = By.id("add-to-basket");

    public By sepetGitButon = By.cssSelector("a[class='gg-ui-btn-default padding-none']");

    public By sepettekiUrunTutari = By.cssSelector("div[class='total-price']");

    public By urunArtirmaAlani = By.cssSelector("select[class='amount']");

    public By urunSayisi2Buton = By.cssSelector("option[value='2']");

    public By urunAdediAlani = By.cssSelector("div[class='gg-d-16 gg-m-14 detail-text']");

    public String beklenenUrunAdedi = "Sepet Tutarı (2 Adet)";

    public By sepettenSilButon = By.cssSelector("div>a>i[class='gg-icon gg-icon-bin-medium']");

    public String sepetBosYazi = "Sepetinizde ürün bulunmamaktadır.";

    public By bosSepetYaziAlani = By.cssSelector("div[class='gg-d-19 gg-w-21 gg-t-19 gg-m-18']>h2");

    public GittigidiyorWeb(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(By elementPath){
        WebElement element = driver.findElement(elementPath);
        element.click();
    }

    public void sendKeysToTheElement(By elementPath, String keyText){
        WebElement element = driver.findElement(elementPath);
        element.sendKeys(keyText);
    }

    public void waitSeconds(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public String getTextOfAnElement (By elementPath){
        WebElement element = driver.findElement(elementPath);
        return element.getText();
    }

    public void validateIsEquals(String expectedCondition, String actualCondition)
    {
        Assert.assertEquals(expectedCondition,actualCondition);
    }

    public String getUrlOfPage(){
        String url = driver.getCurrentUrl();
        return url;
    }

    public String returnProductInfo(By elementPathBilgi, By elementPathFiyat){
        WebElement elementBilgi = driver.findElement(elementPathBilgi);
        WebElement elementTutar = driver.findElement(elementPathFiyat);
        String elementBilgiString = elementBilgi.getText();
        String elementFiyatString = elementTutar.getText();

        System.out.println("ürünün ismi: "+elementBilgiString+ "|||||||ürünün fiyatı: "+elementFiyatString);
        return "ürünün ismi: "+elementBilgiString+ "|||||||ürünün fiyatı: "+elementFiyatString;
    }



}
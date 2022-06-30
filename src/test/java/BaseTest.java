import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//driver'ın ayağa kalkarken exception fırlatmasını önlemek için yazıldı
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    //N11Web class'ın bir örneği (instance'ı yaratıldı)
    GittigidiyorWeb gittigidiyorWeb;

    //teste başlamadan önce yapılacaklar
    @BeforeAll
    public void setUp()
    {
        System.out.println("Driver ayağa kaldırılıyor...");
        System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        System.out.println("Driver ayağa kaldırıldı.");

        gittigidiyorWeb = new GittigidiyorWeb(driver);

        driver.get("https://www.gittigidiyor.com/");
        System.out.println("Gittigidiyor Web Sayfası açıldı.");
    }

    @AfterAll
    public void tearDown()
    {
        //driver.quit();
        System.out.println("Driver kapatıldı.");
    }

}

package automatictester.framework;

import automatictester.objects.DownloadPage;
import automatictester.objects.MainPage;
import automatictester.objects.YandexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ParentScenario {

    private WebDriver driver;

    protected DownloadPage downloadPage;
    protected MainPage mainPage;
    protected YandexPage yandexPage;

    protected void startBrowser() {

//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        downloadPage = new DownloadPage(driver);
        mainPage = new MainPage(driver);
        yandexPage = new YandexPage(driver);
    }

    protected void navigateTo() {
        driver.navigate().to("http://docs.seleniumhq.org/");
    }

    protected void navigateToYandex() {
        driver.navigate().to("http://yandex.ru/");
    }

    protected void closeBrowser() {
        driver.quit();
    }

}
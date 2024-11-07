package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v127.emulation.Emulation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ChromeTest {
    @Test
    void openChromeWithDefaultMode(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

        Assert.assertEquals(driver.getTitle(),"Selenium");
        driver.quit();
    }
    @Test
    void openChromeWithHeadLessMode(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.selenium.dev/");

        Assert.assertEquals(driver.getTitle(),"Selenium");
        driver.quit();
    }
    @Test
    void openChromeWithMobileViewMode(){
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 412);
        deviceMetrics.put("height", 915);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.selenium.dev");

        Assert.assertEquals(driver.getTitle(),"Selenium");
        driver.quit();
    }
    @Test
    void openChromeWithOldVersion(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("125");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

        Assert.assertEquals(driver.getTitle(),"Selenium");
        driver.quit();
    }
    @Test
    void openChromeWithBetaVersion(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("131");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

        Assert.assertEquals(driver.getTitle(),"Selenium");
        driver.quit();
    }
    @Test
    void openBrowserWithFakeGeoLocation(){
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();
        devTools.send(Emulation.setGeolocationOverride(Optional.of(37.774929),
                Optional.of(-122.419416),
                Optional.of(1)));

        driver.get("https://oldnavy.gap.com/stores");
    }
}

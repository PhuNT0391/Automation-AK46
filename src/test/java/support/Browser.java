package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    private static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    public static void openBrowser(String browserName){
        switch (browserName.toLowerCase()){
            case "chrome":{
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless=new");
                driver = new ChromeDriver(chromeOptions);
                break;
            }
            case "firefox":{
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless=new");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            }
            case "edge":{
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--headless=new");
                driver = new EdgeDriver(edgeOptions);
                break;
            }
            case "safari":{
                driver = new SafariDriver();
                break;
            }
            default:
                throw new IllegalArgumentException("Unsupppoted browser:" + browserName.toLowerCase());
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }
    public static void visit(String url){
        driver.get(url);
    }
    public static void quit(){
        if (driver != null){
            driver.quit();
        }
    }

}

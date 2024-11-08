package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class  HoverTest {
    WebDriver driver;

    @BeforeMethod
    void setUp(){
        driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(("--headless=new"));

        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    @Test
    void ableToHoverImage1() {
        Actions actions = new Actions(driver);

        actions
                .moveToElement(driver.findElements(By.cssSelector("#content .figure"))
                        .get(0)).perform();
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }

}

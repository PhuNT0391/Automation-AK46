package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class HoverTest {
    WebDriver driver;

    @BeforeMethod
    void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    @Test
    void ableToHoverImage1() {

        Actions actions = new Actions(driver);

        actions
                .moveToElement(driver.findElements(By.cssSelector("#content .figure"))
                        .get(0))
                .perform();
    }
    @Test
    void ableToHoverImage2(){

        Actions actions = new Actions(driver);

        actions
                .moveToElement(
                        driver
                                .findElements(By.cssSelector("#content .figure"))
                                .get(1))
                .perform();

        String imageName = driver.findElements(By.cssSelector(".figcaption h5")).get(1).getText();
        Assert.assertEquals(imageName,"name: user2");
    }

    @Test
    void ableToHoverImage3(){

        Actions actions = new Actions(driver);

        actions
                .moveToElement(
                        driver
                                .findElements(By.cssSelector("#content .figure"))
                                .get(2))
                .perform();

        String imageName = driver.findElements(By.cssSelector(".figcaption h5")).get(2).getText();
        Assert.assertEquals(imageName,"name: user3");
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }

}

package theInternet;

import org.checkerframework.checker.units.qual.C;
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
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    @DataProvider
    Object[][] testData() {
        return new Object[][]{
                {0, "name: user1"},
                {1, "name: user2"},
                {2, "name: user3"}
        };
    }

    @Test(dataProvider = "testData")
    void ableToHoverImage(int imageIndex, String expectedImageName) {

        Actions actions = new Actions(driver);

        actions
                .moveToElement(driver.findElements(By.cssSelector("#content .figure"))
                        .get(imageIndex))
                .perform();
        String imageName = driver.findElements(By.cssSelector(".figcaption h5")).get(imageIndex).getText();
        Assert.assertEquals(imageName, expectedImageName);
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}

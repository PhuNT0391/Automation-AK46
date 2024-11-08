package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class HoverTest {

    @Test
    void ableToHoverImage1() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);

        actions
                .moveToElement(driver.findElements(By.cssSelector("#content .figure"))
                        .get(0)).perform();
        driver.quit();
    }
}

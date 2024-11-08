package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckboxesTest {
    WebDriver driver;
    @BeforeMethod
    void setUp(){
        driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    void ableToSelectACheckbox() {
        WebElement checkbox = driver.findElement(By.xpath("//form[@id]//input[1]"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        Assert.assertTrue(checkbox.isSelected());
    }

    @Test
    void ableToUnSelectACheckbox() {
        WebElement checkbox = driver.findElement(By.xpath("//form[@id]//input[2]"));
        if (checkbox.isSelected()) {
            checkbox.click();
        }
        Assert.assertFalse(checkbox.isSelected());
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}

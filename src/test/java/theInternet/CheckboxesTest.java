package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest {

    @Test
    void ableToSelectACheckbox() {
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox = driver.findElement(By.xpath("//form[@id]//input[1]"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        Assert.assertTrue(checkbox.isSelected());

        driver.quit();
    }

    @Test
    void ableToUnSelectACheckbox() {
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox = driver.findElement(By.xpath("//form[@id]//input[2]"));
        if (checkbox.isSelected()) {
            checkbox.click();
        }
        Assert.assertFalse(checkbox.isSelected());

        driver.quit();
    }
}

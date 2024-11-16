package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import support.Browser;
import theInternet.pages.FormAuthenticationPage;

public class FromAuthenticationTest {
    @BeforeClass
    void setUp() {
        Browser.openBrowser("chrome");
    }

    @Test
    void shouldBeSuccessfullyWithValidCredentials() {
        FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage();
        formAuthenticationPage.open();
        formAuthenticationPage.login("tomsmith", "SuperSecretPassword!");

        Assert.assertEquals(Browser.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        Assert.assertTrue(formAuthenticationPage.isLoggedIn());
    }

    @AfterClass
    void tearDown() {
        Browser.quit();
    }
//
//    @Test
//    void shouldBeFailedWithInvalidUsername() {
//        FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage();
//        formAuthenticationPage.open();
//        formAuthenticationPage.login("tomsmith123", "SuperSecretPassword!");
//
//        Assert.assertTrue(driver.findElement(By.className("error")).getText().contains("Your username is invalid!"));
//    }
//
//    @Test
//    void shouldBeFailedWithInvalidPassword() {
//        driver.get("https://the-internet.herokuapp.com/login");
//
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!123");
//        driver.findElement(By.cssSelector("button[type=submit]")).click();
//
//        Assert.assertTrue(driver.findElement(By.className("error")).getText().contains("Your password is invalid!"));
//    }
//
//    @Test
//    void backLoginPage() {
//        driver.get("https://the-internet.herokuapp.com/login");
//
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("button[type=submit]")).click();
//
//        driver.findElement(By.cssSelector("a[class='button secondary radius']")).click();
//        Assert.assertTrue(driver.findElement(By.className("success")).getText().contains("You logged out of the secure area!"));
//    }
}

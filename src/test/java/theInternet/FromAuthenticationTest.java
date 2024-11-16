package theInternet;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.Browser;
import theInternet.pages.FormAuthenticationPage;

public class FromAuthenticationTest {
    @BeforeMethod
    void setUp() {
        Browser.openBrowser("chrome");
    }

    @DataProvider
    Object[][] testData(){
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!","https://the-internet.herokuapp.com/secure","success","You logged into a secure area!"},
                {"tomsmi1h", "SuperSecretPassword!","https://the-internet.herokuapp.com/login","error","Your username is invalid!"},
                {"tomsmith", "SuperSecretPassword","https://the-internet.herokuapp.com/login","error","Your password is invalid!"},

        };
    }

    @Test(dataProvider = "testData")
    void verifyLoginFunction(String username,String password,String expectedUrl, String expectedMessageType, String expectedMessageContent) {
        FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage();
        formAuthenticationPage.open();
        formAuthenticationPage.login(username,password);

        Assert.assertEquals(Browser.getCurrentUrl(), expectedUrl);
        Assert.assertTrue(formAuthenticationPage.verifyMessageContent(expectedMessageType,expectedMessageContent));
    }

    @AfterMethod
    void tearDown() {
        Browser.quit();
    }
}

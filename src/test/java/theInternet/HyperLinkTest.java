package theInternet;


import org.testng.Assert;
import org.testng.annotations.*;
import support.Browser;
import theInternet.pages.HyperLinkPage;

public class HyperLinkTest {

    @BeforeMethod
    void setup() {
        Browser.openBrowser("chrome");
    }

    @Test
    void tc04() {
        HyperLinkPage hyperLinkPage = new HyperLinkPage();
        hyperLinkPage.open();;

        hyperLinkPage.clickHyperLink("200");
        Assert.assertTrue(hyperLinkPage.isPageUrlContain("200"));
        hyperLinkPage.clickHyperLink("here");

        hyperLinkPage.clickHyperLink("301");
        Assert.assertTrue(hyperLinkPage.isPageUrlContain("301"));
        hyperLinkPage.clickHyperLink("here");

        hyperLinkPage.clickHyperLink("404");
        Assert.assertTrue(hyperLinkPage.isPageUrlContain("404"));
        hyperLinkPage.clickHyperLink("here");

        hyperLinkPage.clickHyperLink("500");
        Assert.assertTrue(hyperLinkPage.isPageUrlContain("500"));
    }
    @AfterMethod
    void tearDown(){
        Browser.quit();
    }
}

package theInternet.pages;

import org.openqa.selenium.WebDriver;
import support.Browser;

public class HoverPage {
    WebDriver driver;

    public HoverPage() {
        this.driver = Browser.getDriver();
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

}

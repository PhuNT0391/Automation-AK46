package theInternet.pages;

import org.openqa.selenium.By;
import support.Browser;

public class HyperLinkPage {
    public void open(){
        Browser.visit("https://the-internet.herokuapp.com/status_codes");
    }
    public void clickHyperLink (String hyperLink){
        Browser.click(By.linkText(hyperLink));
    }

    public boolean isPageUrlContain(String hyperLink){
        return Browser.getCurrentUrl().contains(String.format("https://the-internet.herokuapp.com/status_codes/%s",hyperLink));
    }


}

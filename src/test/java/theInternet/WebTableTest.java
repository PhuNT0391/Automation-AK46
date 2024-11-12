package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
    @Test
    void tc05() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");

        driver
                .findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"))
                .stream()
                .forEach(webElement -> System.out.println(webElement.getText()));
    }
}

package theInternet;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import support.Browser;
import theInternet.pages.ToDoPage;

import static support.Browser.*;

public class ToDoTest {
    ToDoPage toDoPage;

    @BeforeMethod
    void setup() {
        openBrowser("chrome");
        toDoPage = new ToDoPage();
    }

    @Test
    void tc11_ableCreateNewToDo() {
        toDoPage.open();


    }
}

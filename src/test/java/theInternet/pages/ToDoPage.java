package theInternet.pages;

import org.openqa.selenium.By;

import static support.Browser.*;

public class ToDoPage {
    public void open() {
        visit("https://todomvc.com/examples/react/dist/");
    }
    public void addNewTask(String taskName) {
//        fill(By.className("new-todo"));
    }

    public void markComplete(String taskName) {

    }

    public void delete(String taskName) {

    }

    public void editTaskName(String taskName, String newName) {

    }
    public boolean isTaskExist() {
    return true;
    }
    public int getItemLeft() {
        return 0;
    }

}

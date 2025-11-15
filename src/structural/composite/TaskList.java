package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task{
    String title;
    List<Task> tasks;

    public TaskList(String title){
        this.title = title;
        tasks = new ArrayList<>();
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }

    @Override
    public void display() {
        System.out.println("Task list: " + title);
        for (Task task: tasks){
            task.display();
        }
    }
}

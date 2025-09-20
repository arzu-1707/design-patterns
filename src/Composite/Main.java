package Composite;

public class Main {
    public static void main(String[] args) {
        Task task1 = new SimpleTask("Task 1");
        Task task2 = new SimpleTask("Task 2");

        TaskList taskList1 = new TaskList("TaskList 1");
        taskList1.addTask(task1);
        taskList1.addTask(task2);

        TaskList taskList2 = new TaskList("TaskList 2");
        taskList2.addTask(new SimpleTask("task 3"));
        taskList2.addTask(new SimpleTask("task 4"));

        taskList1.addTask(taskList2);

        taskList1.display();
    }
}

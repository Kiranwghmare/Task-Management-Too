import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1; // Start IDs from 1
    }

    public void addTask(String title) {
        Task newTask = new Task(nextId++, title);
        tasks.add(newTask);
        System.out.println("Task added: " + title);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current tasks:");
        for (Task task : tasks) {
            System.out.println("ID: " + task.getId() + ", Title: " + task.getTitle() + ", Completed: " + task.isCompleted());
        }
    }

    public void updateTask(int id, String newTitle) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(newTitle);
                System.out.println("Task updated: " + newTitle);
                return;
            }
        }
        System.out.println("Task not found with ID: " + id);
    }

    public void deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("Task deleted: " + task.getTitle());
                return;
            }
        }
        System.out.println("Task not found with ID: " + id);
    }
}

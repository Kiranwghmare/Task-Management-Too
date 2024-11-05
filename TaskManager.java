import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.nextId = 1; // Starting ID for tasks
    }

    // Create
    public void addTask(String title) {
        Task task = new Task(nextId++, title);
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Read
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Update
    public void updateTask(int id, String newTitle, boolean completed) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(completed);
                // Update title if provided
                if (newTitle != null && !newTitle.isEmpty()) {
                    // You might want to add a setter in the Task class for the title
                    task.setTitle(newTitle); // Assuming you add a setter for title
                }
                System.out.println("Task updated: " + task);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    // Delete
    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        System.out.println("Task deleted with ID: " + id);
    }
}

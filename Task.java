public class Task {
    private int id;
    private String title;
    private boolean isCompleted;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false; // Default status
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}

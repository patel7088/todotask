import src.Task;

public class Main {
    public static void main(String[] args) {
       
        Task task = new Task();
        task.userId = 101;
        task.taskName = "Learn Java";
        task.taskDescription = "Complete the basic Java tutorial.";
        task.deadline = "2025-01-20"; 

       
        String taskJson = "{\n" +
                          "  \"userId\": " + task.userId + ",\n" +
                          "  \"taskName\": \"" + task.taskName + "\",\n" +
                          "  \"taskDescription\": \"" + task.taskDescription + "\",\n" +
                          "  \"deadline\": \"" + task.deadline + "\"\n" +
                          "}";

       
        System.out.println("Task in JSON format:");
        System.out.println(taskJson);
    }
}

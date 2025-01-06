public class Main{
    public static void main(String[] args) {
        Task task = new Task();
        
        task.userId=101;
        task.taskName="maths work";
        task.taskDiscription="arthematic operations";
        System.out.println("Task details are ");
        System.out.println("id of an user is "+task.userId);
        System.out.println("Name of the task is :"+task.taskName);
        System.out.println("Task discription is "+task.taskDiscription);
        

        
    }
}
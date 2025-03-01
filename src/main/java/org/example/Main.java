package org.example;

import org.example.ProjectConfig;
import org.example.Task;
import org.example.TaskRepository;
import org.example.TaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        TaskRepository tR = context.getBean(TaskRepository.class);
        Task task1 = new Task("1", "Learn Spring", "Understand Spring Framework annotations");
        tR.addTask(task1);
        System.out.println("Task added to repository: " + tR.getTask("1"));

        TaskService tS = context.getBean(TaskService.class);
        tS.createTask("2", "Spring Beans", "Learn how Spring manages beans");

        Task retrievedTask = tS.getTask("2");
        System.out.println("Task retrieved from service: " + retrievedTask);

        System.out.println("All tasks in repository: " + tR.getAllTasks());
    }
}

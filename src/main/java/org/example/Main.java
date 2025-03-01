package org.example;

import org.example.ProjectConfig;
import org.example.TaskService;
import org.example.TaskStatistics;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        TaskService tS = context.getBean(TaskService.class);
        tS.createTask("1", "Study Spring", "Learn Spring Framework without Boot");

        TaskService aS = context.getBean("advancedTaskService", TaskService.class);
        aS.createTask("2", "Spring Testing", "Learn to test Spring applications");

        TaskStatistics stats = context.getBean(TaskStatistics.class);
    }
}


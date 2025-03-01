package org.example;

import org.springframework.stereotype.Component;

@Component
public class TaskLogger {
    public TaskLogger() {
        System.out.println("TaskLogger with (EAGER)");
    }
}



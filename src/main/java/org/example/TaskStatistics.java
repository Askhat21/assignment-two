package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TaskStatistics {
    public TaskStatistics() {
        System.out.println("TaskStatistics with (LAZY)");
    }
}

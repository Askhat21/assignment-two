package org.example;

import org.example.Task;

public interface TaskService {
    void createTask(String id, String title, String description);
    Task getTask(String id);
}


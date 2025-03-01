package org.example;

import org.example.Task;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TaskRepository {
    private final Map<String, Task> tasks = new HashMap<>();

    public void addTask(Task task) {
        tasks.put(task.getId(), task);
    }

    public Task getTask(String id) {
        return tasks.get(id);
    }

    public Map<String, Task> getAllTasks() {
        return tasks;
    }
}

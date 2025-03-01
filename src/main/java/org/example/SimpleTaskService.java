package org.example;

import org.example.Task;
import org.example.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SimpleTaskService implements TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public SimpleTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void createTask(String id, String title, String description) {
        Task task = new Task(id, title, description);
        taskRepository.addTask(task);
        System.out.println("SimpleTaskService: Task created - " + task);
    }

    @Override
    public Task getTask(String id) {
        return taskRepository.getTask(id);
    }
}

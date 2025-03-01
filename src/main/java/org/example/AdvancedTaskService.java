package org.example;

import org.example.Task;
import org.example.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("advancedTaskService")
public class AdvancedTaskService implements TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public AdvancedTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void createTask(String id, String title, String description) {
        Task task = new Task(id, title, description);
        taskRepository.addTask(task);
        System.out.println("AdvancedTaskService: Task created - " + task);
    }

    @Override
    public Task getTask(String id) {
        return taskRepository.getTask(id);
    }
}


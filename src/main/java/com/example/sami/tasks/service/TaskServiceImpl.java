package com.example.sami.tasks.service;

import com.example.sami.tasks.domain.Task;
import com.example.sami.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * Created by mohamed-sami-mejri on 22/10/18.
 */
@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }
}

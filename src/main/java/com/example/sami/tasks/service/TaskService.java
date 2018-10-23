package com.example.sami.tasks.service;

import com.example.sami.tasks.domain.Task;

/**
 * Created by mohamed-sami-mejri on 22/10/18.
 */
public interface TaskService {

    public Iterable<Task> list();
    Task addTask(Task task);
}

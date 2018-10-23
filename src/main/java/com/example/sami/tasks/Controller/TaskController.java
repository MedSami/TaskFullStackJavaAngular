package com.example.sami.tasks.Controller;

import com.example.sami.tasks.domain.Task;
import com.example.sami.tasks.repository.TaskRepository;
import com.example.sami.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mohamed-sami-mejri on 22/10/18.
 */

@CrossOrigin(origins = { "http://localhost:4200" },maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("/api/tasks/")
public class TaskController {


    private TaskService taskService;

    public TaskController(TaskService tastService) {
        this.taskService = tastService;
    }

    @CrossOrigin(origins = { "http://localhost:4200" },maxAge = 4800, allowCredentials = "false")
    @GetMapping(value={"","/"})
    public Iterable<Task> listTasks(){
        return this.taskService.list();
    }

    @CrossOrigin(origins = { "http://localhost:4200" },maxAge = 4800, allowCredentials = "false")
    @PostMapping("save")
    public Task addTask(@RequestBody Task task){
        return this.taskService.addTask(task);
    }


}

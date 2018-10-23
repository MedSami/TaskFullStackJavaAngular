package com.example.sami.tasks.repository;

import com.example.sami.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mohamed-sami-mejri on 22/10/18.
 */
public interface TaskRepository extends CrudRepository<Task,Long>{
}

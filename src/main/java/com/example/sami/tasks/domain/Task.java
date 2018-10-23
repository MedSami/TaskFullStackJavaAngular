package com.example.sami.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by mohamed-sami-mejri on 22/10/18.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
@Id
@GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern="MM/dd/yyyy")
    private LocalDate dueDate;
    private Boolean completed;
}

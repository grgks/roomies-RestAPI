package com.happy.roomies.model;

import com.happy.roomies.core.enums.TaskStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Task extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @ManyToMany
    @JoinTable(
            name = "roommate_task",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "roommate_id")
    )
    private List<Roommate> assignees;

    @ManyToOne
    @JoinColumn(name = "house_id", nullable = false)
    private House house;

    @Column(name = "due_date")
    private LocalDate dueDate;



}

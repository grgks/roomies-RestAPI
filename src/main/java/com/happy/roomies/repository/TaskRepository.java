package com.happy.roomies.repository;

import com.happy.roomies.core.enums.TaskStatus;
import com.happy.roomies.model.House;
import com.happy.roomies.model.Roommate;
import com.happy.roomies.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task,Long>, JpaSpecificationExecutor<Task> {


List<Task> findByTaskName(String taskName);
List<Task> findByAssignees(Roommate assignees);

List<Task> findByTaskStatus(TaskStatus taskStatus);

List<Task> findByHouse(House house);
List<Task> findByDueDateBetween(LocalDateTime startDate, LocalDateTime endDate);

}

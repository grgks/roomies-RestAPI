package com.happy.roomies.model;

import com.happy.roomies.core.enums.TaskStatus;
import com.happy.roomies.util.TestDataFactory;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    /**
     * Tests the default (no-args) constructor of Task
     * and verifies that setters correctly assign values.
     */
    @Test
    void defaultConstructor() {
        List<Roommate> assignees = List.of(TestDataFactory.createDefaultRoommate());
        House house = TestDataFactory.createDefaultHouse();

        //act
        Task task = new Task();
        task.setId(1L);
        task.setTaskName("Clean the doors");
        task.setTaskStatus(TaskStatus.DONE);
        task.setAssignees(assignees);
        task.setHouse(house);
        task.setDueDate(LocalDateTime.of(2026,10,
                10,10,20));

        //assertion
        assertNotNull(task);
        assertNotNull(house);

        assertEquals(1,task.getId());
        assertEquals("Clean the doors", task.getTaskName());
        assertEquals(TaskStatus.DONE, task.getTaskStatus());
        assertEquals(assignees, task.getAssignees());
        assertEquals(house, task.getHouse());

        assertEquals(LocalDateTime.of(2026,10,
                10,10,20), task.getDueDate());

    }

    /**
     * Tests the all-args constructor of House
     * to ensure all fields are properly initialized.
     */
    @Test
    void allArgsConstructor(){
        List<Roommate> assignees = List.of(TestDataFactory.createDefaultRoommate());
        House house = TestDataFactory.createDefaultHouse();

        //act
        Task task = new Task(1L,"Clean the doors",
                TaskStatus.DONE, assignees,house,
                LocalDateTime.of(2026,10,
                        10,10,20));

        //assertion
        assertNotNull(task);
        assertNotNull(house);

        assertEquals(1,task.getId());
        assertEquals("Clean the doors", task.getTaskName());
        assertEquals(TaskStatus.DONE, task.getTaskStatus());
        assertEquals(assignees, task.getAssignees());
        assertEquals(house, task.getHouse());

        assertEquals(LocalDateTime.of(2026,10,
                10,10,20), task.getDueDate());
    }

    /**
     * Checks if assignees are null when not set
     */
    @Test
    void assignees_ShouldBeNull_WhenNotSet(){

        //act
        Task task = new Task();
        task.setId(1L);
        task.setTaskName("Clean the doors");
        task.setTaskStatus(TaskStatus.DONE);

        //assertion
        assertNotNull(task);
        assertNull(task.getAssignees());
    }

    /**
     * Checks if taskStatus is null when not set
     */
    @Test
    void taskStatus_ShouldBeNull_WhenNotSet(){

        //act
        Task task = new Task();
        task.setId(1L);
        task.setTaskName("Clean the doors");
        task.setDueDate(LocalDateTime.of(2026,10,
                10,10,20));

        //assertion
        assertNull(task.getTaskStatus());

    }

    /**
     * Checks if dueDate is null when not set
     */
    @Test
    void dueDate_ShouldBeNull_WhenNotSet(){

        //act
        Task task = new Task();
        task.setId(1L);
        task.setTaskName("Clean the doors");
        task.setTaskStatus(TaskStatus.DONE);

        //assertion
        assertNull(task.getDueDate());
    }
}

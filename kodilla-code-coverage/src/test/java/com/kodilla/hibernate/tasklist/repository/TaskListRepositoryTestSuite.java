package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;
    private static final String LISTNAME = "Stuff";

    @Test
    void testFindByListName() {
        TaskList taskList = new TaskList(LISTNAME, "Things to do");
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        List<TaskList> readTaskList = taskListRepository.findByListName(listName);

        Assertions.assertEquals("Stuff", readTaskList.get(0).getListName());

        int id = readTaskList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList(String name) {
        tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        tasks.add(task);
    }
    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }
}

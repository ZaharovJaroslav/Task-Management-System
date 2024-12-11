package ru.yaroslav_zaharov.task_management_system.task.model;

import ru.yaroslav_zaharov.task_management_system.user.model.User;

public class Task {

    private Long id;

    private String title;

    private String description;

    private TaskStatus status;

    private TaskPriority priority;

    private User creator;

    private User executor;


}

package com.boroda.math_trainer;

import java.util.Random;

public class Task {
    int first;
    int second;
    TaskType taskType;
    int result;

    public Task(TaskType taskType) {
        if (taskType==TaskType.SUM){
            this.first = new Random().nextInt(50);
            this.second = new Random().nextInt(50);
            this.taskType = TaskType.SUM;
            this.result = first+second;
        }

    }
}

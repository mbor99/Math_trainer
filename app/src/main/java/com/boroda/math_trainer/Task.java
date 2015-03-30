package com.boroda.math_trainer;

import java.util.Random;

public class Task {
    int first;
    int second;
    TaskType taskType;
    int result;

    public Task(TaskType taskType) {
        if (taskType == TaskType.SUM) {
            this.first = new Random().nextInt(50);
            this.second = new Random().nextInt(50);
            this.result = first + second;
        }
        if (taskType == TaskType.MINUS) {
            this.first = new Random().nextInt(50);
            this.second = new Random().nextInt(50);
            if (this.second > this.first) {
                int temp = this.first;
                this.first = this.second;
                this.second = temp;
            }
            this.result = first - second;
        }
        if (taskType == TaskType.MULTIPLE) {
            this.first = new Random().nextInt(10);
            this.second = new Random().nextInt(10);
            this.result = first * second;
        }

    }
}

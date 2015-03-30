package com.boroda.math_trainer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TaskType {
    SUM, MINUS, MULTIPLE;//, DIVIDE;
    private static final List<TaskType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TaskType randomType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}


package com.boroda.math_trainer;

import java.util.Random;

public class Numbers {
    private int first;
    private int second;
//    enum OPERATIONS {SUM, MINUS,MULTIPLE, DIVIDE }

    public Numbers() {
        Random random = new Random();
        this.first = random.nextInt(50);
        this.second = random.nextInt(50);
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}

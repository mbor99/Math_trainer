package com.boroda.math_trainer;

public class MathTrainer {
    public Numbers generateNumbers() {
        return new Numbers();
    }

    public int sum() {
        Numbers n = generateNumbers();
        int correctResult = n.getFirst() + n.getSecond();
        return correctResult;

    }

    public void minus() {

    }

    public void multiple() {

    }

    public void divade() {

    }

    public boolean calculate() {

        return false;
    }
}


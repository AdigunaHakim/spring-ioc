package com.example;

public class Brain {
    private int noOfBrain;

    public void setNoOfBrain(int noOfBrain) {
        this.noOfBrain = noOfBrain;
    }

    public int getNoOfBrain() {
        return noOfBrain;
    }

    public void thinking() {
        System.out.println("start thinking with " + noOfBrain + " brain");
    }
}

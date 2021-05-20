package com.example;

public class Lungs {
    private int noOfLungs;

    public void setNoOfLungs(int noOfLungs) {
        this.noOfLungs = noOfLungs;
    }

    public void breathe() {
        System.out.println("start breathe with " + noOfLungs + " lungs");
    }
}

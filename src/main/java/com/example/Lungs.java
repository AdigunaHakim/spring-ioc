package com.example;

public class Lungs {
    private int noOfLungs;

    public void setNoOfLungs(int noOfLungs) {
        this.noOfLungs = noOfLungs;
    }

    public int getNoOfLungs() {
        return noOfLungs;
    }

    public void breathe() {
        System.out.println("start breathe with " + noOfLungs + " lungs");
    }
}

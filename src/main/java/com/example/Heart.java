package com.example;

import org.springframework.stereotype.Component;

@Component("heart")
public class Heart {
    private int noOfHeart;

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void pumping() {
        System.out.println("start pumping with " + noOfHeart + " heart");
    }
}

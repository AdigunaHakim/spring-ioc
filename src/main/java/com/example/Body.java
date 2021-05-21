package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("humanBody")
public class Body {
    private Brain brain;
    private Heart heart;
    private Lungs lungs;

    public void setBrain(@Qualifier("humanBrain") Brain brain) {
        this.brain = brain;
        System.out.println("setBrain called, no of brain : " + brain.getNoOfBrain());
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("setHeart called, no of heart : " + heart.getNoOfHeart());
    }

    public void setLungs(Lungs lungs) {
        this.lungs = lungs;
        System.out.println("setLungs called, no of lungs : " + lungs.getNoOfLungs());
    }

    public Body(@Qualifier("humanBrain") Brain brain, Heart heart, Lungs lungs) {
        this.brain = brain;
        this.heart = heart;
        this.lungs = lungs;
        System.out.println("constructor called, no of brain : " + brain.getNoOfBrain() + ", no of heart : "
                + heart.getNoOfHeart() + ", no of lungs : " + lungs.getNoOfLungs());
    }

    public void living() {
        if (brain == null || heart == null || lungs == null) {
            System.out.println("he died...");
        } else {
            System.out.println("he alive...");
            brain.thinking();
            heart.pumping();
            lungs.breathe();
        }
    }
}

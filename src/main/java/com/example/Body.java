package com.example;

public class Body {
    private Brain brain;
    private Heart heart;
    private Lungs lungs;

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void setLungs(Lungs lungs) {
        this.lungs = lungs;
    }

    public void living(){
        if (brain == null || heart == null || lungs == null){
            System.out.println("he died...");
        } else {
            System.out.println("he alive...");
            brain.thinking();
            heart.pumping();
            lungs.breathe();
        }
    }
}

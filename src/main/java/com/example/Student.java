package com.example;

public class Student {
    private int id;
    private String name;
    private MathCheat mathCheat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MathCheat getMathCheat() {
        return mathCheat;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheating(){
        System.out.println("Student id : " + id + " name : " + name);
        mathCheat.doCheat();
    }
}

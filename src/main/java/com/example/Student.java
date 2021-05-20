package com.example;

public class Student {
    private int id;
    private String name;
    private Cheat cheat;

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

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void cheating(){
        System.out.println("Student id : " + id + " name : " + name);
        cheat.doCheat();
    }
}

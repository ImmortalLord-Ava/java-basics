package com.dsh.learning.java.exercise;

public class Teacher extends Person{
    private String title;
    public Teacher(String title){
        super("张白露",19);
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
    
}

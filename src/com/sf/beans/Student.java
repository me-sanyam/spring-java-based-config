package com.sf.beans;

public class Student {
    private int marks;
    private int rollNo;
    private String name;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println(this.rollNo);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}

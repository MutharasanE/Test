package com.sapient.entity;

import lombok.Data;

@Data
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        setName(name);
        setAddress(address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student [name" + getName() + ",address" + getAddress() + ",fee=" + fee + ", program=" + program
                + ", year=" + year + "]";
    }
}

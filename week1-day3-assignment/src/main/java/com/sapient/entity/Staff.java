package com.sapient.entity;

import lombok.Data;

@Data
public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        setName(name);
        setAddress(address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff [name" + getName() + ",address" + getAddress() + ",pay=" + pay + ", school=" + school + "]";
    }
}

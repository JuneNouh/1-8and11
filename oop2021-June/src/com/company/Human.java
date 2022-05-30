package com.company;

import com.company.devices.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;

    public final static String HUMAN_SPECIE = "homo sapiens";

    private Double salary;

    Human(Double salary) {
        super(HUMAN_SPECIE,FoodType.ALL);
        this.setSalary(salary);
    }

    public Double getSalary() {

        return this.salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("NOBODY WILL PAY FOR WORKING");
            this.salary = 0.0;
        }
    }

}

package com.empWage;

public class empWageComputation {
    public static void main(String[] args) {
        int Is_present = 1;
        double empCheck = Math.floor((Math.random()*100)%2);
        if (empCheck == Is_present)
            System.out.println("Employee is Present ");
        else
            System.out.println("Employee is absent");
    }
}

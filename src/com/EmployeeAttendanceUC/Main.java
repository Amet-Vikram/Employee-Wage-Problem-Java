package com.EmployeeAttendanceUC;

public class Main {

    public static void main(String[] args) {
        double empCheck = Math.floor((Math.random()*100)%2);

        if (empCheck == 1)
            System.out.println("Employee is Present ");
        else
            System.out.println("Employee is absent");
    }
}

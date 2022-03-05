package com.empWage;

public class empWageComputation {
    //Class constants
    static final int WAGE = 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HRS = 99;

    public static void main(String[] args) {
        //Local Variables
        int hrs;
        int totalHrs = 0;
        int salary = 0;
        int totalDays = 1;
        //Looping for a month
        while (totalDays != MAX_WORKING_DAYS && totalHrs != MAX_WORKING_HRS) {
            totalDays++;
            //Performing check
            double empCheck = empChoice();
            //Operations
            switch ((int) empCheck) {
                case 1 -> hrs = 8;
                case 2 -> hrs = 4;
                default -> hrs = 0;
            }
            totalHrs += hrs;
            salary = WAGE * totalHrs;
        }
        System.out.println("Total Working Days are " +totalDays);
        System.out.println("Total Working Hours are " + totalHrs);
        System.out.println("The total salary is " + salary);
    }
    static double empChoice(){
        return Math.floor((Math.random() * 100) % 3);
    }
}

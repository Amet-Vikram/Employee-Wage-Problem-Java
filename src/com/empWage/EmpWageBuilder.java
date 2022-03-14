package com.empWage;

import java.util.ArrayList;

public class EmpWageBuilder  {

    private ArrayList<CompanyEmpWage> record = new ArrayList();

    void addRecord(CompanyEmpWage o){
        record.add(o);
    }

    void getRecord(){
        for (CompanyEmpWage company : record) {
            System.out.println("Company: " + company.nameOfCompany);
            System.out.println("Days Worked: " + company.totalDays);
            System.out.println("Hours Worked: " + company.totalHrs);
            System.out.println("Salary Earned: " + company.totalWage + "\n");
        }
    }
}

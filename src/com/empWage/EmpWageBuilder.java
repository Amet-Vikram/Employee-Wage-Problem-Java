package com.empWage;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

interface InterfaceCalculateWage {
    void addRecord(String companyName, int empWagePerHour, int workingHours, int workingDays);
    void getRecord();
}

public class EmpWageBuilder implements InterfaceCalculateWage {

    final private ArrayList<CompanyEmpWage> record = new ArrayList();

    @Override
    public void addRecord(String name, int workDays, int workHours, int wage){
        CompanyEmpWage o = new CompanyEmpWage(name, workDays, workHours, wage);
        record.add(o);
    }

    @Override
    public void getRecord(){
        for (CompanyEmpWage company : record) {
            System.out.println("Company: " + company.nameOfCompany);
            System.out.println("Days Worked: " + company.totalDays);
            System.out.println("Hours Worked: " + company.totalHrs);
            System.out.println("Salary Earned: " + company.totalWage);
            System.out.println("Daily Wage: " + company.dailyWageList+ "\n");
        }
    }
}

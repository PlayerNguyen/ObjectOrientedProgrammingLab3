package com.github.playernguyen.question4;

import java.util.Objects;

public class Employee implements Person, Comparable<Employee> {

    private final String employeeId;
    private final String employeeName;
    private Integer salaryPerHour;
    private Integer noOfLeavingDay;
    private Integer noOfTravelDay;


    public Employee(String employeeId,
                    String employeeName,
                    Integer salaryPerHour,
                    Integer noOfLeavingDay,
                    Integer noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    @Override
    public Integer calculateWeeklySalary() {
        return this.salaryPerHour * 8 / (5 - noOfLeavingDay + noOfTravelDay / 2);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Integer getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(Integer salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public Integer getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(Integer noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public Integer getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(Integer noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }

    @Override
    public int compareTo(Employee o) {

        if (this.noOfTravelDay > o.noOfTravelDay) {
            return 1;
        } else if (this.noOfTravelDay < o.noOfTravelDay) {
            return -1;
        } else {
            if (this.noOfLeavingDay < o.noOfLeavingDay) {
                return 1;
            } else if (this.noOfLeavingDay > o.noOfLeavingDay) {
                return -1;
            }
            return 0;
        }

    }

    @Override
    public String toString() {
        return String.format("[Name: %s, Salary Per Hour: %d, Weekly Salary: %d]",
                this.employeeName,
                this.salaryPerHour,
                this.calculateWeeklySalary()
        );
    }
}

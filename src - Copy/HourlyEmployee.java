/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    private double overtimeRate;

    public HourlyEmployee(
            int id, String name, Gender gender,
            LocalDate hireDate, double hourlyRate,
            double hoursWorked, double overtimeRate) {

        super(id, name, gender, hireDate);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        double regularHours = Math.min(hoursWorked, 160);
        double overtimeHours = Math.max(hoursWorked - 160, 0);

        return (regularHours * hourlyRate)
                + (overtimeHours * overtimeRate);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Hourly Rate: " + hourlyRate
                + ", Hours Worked: " + hoursWorked
                + ", Overtime Rate: " + overtimeRate
                + ", Total Salary: " + calculateSalary();
    }
}

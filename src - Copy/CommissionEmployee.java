/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.time.LocalDate;

public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double commissionRate;
    private double salesAmount;

    public CommissionEmployee(
            int id, String name, Gender gender,
            LocalDate hireDate, double baseSalary,
            double commissionRate, double salesAmount) {

        super(id, name, gender, hireDate);

        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.salesAmount = salesAmount;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public double calculateCommission() {
        return salesAmount * commissionRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + calculateCommission();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Base Salary: " + baseSalary
                + ", Commission: " + calculateCommission()
                + ", Total Salary: " + calculateSalary();
    }
}

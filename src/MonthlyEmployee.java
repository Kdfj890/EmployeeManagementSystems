/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */


import java.time.LocalDate;
public class MonthlyEmployee extends Employee {
    private double monthlySalary;
    private int vacationDays;
    private double bonusPercentage;
    private boolean hasHealthInsurance;
    public MonthlyEmployee(
            int id, String name, Gender gender,
            LocalDate hireDate, double monthlySalary,
            int vacationDays, double bonusPercentage,
            boolean hasHealthInsurance) {
        super(id, name, gender, hireDate);
        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonusPercentage = bonusPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public boolean getHasHealthInsurance() {
        return hasHealthInsurance;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public void setHasHealthInsurance(boolean hasHealthInsurance) {
        this.hasHealthInsurance = hasHealthInsurance;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary
                + (monthlySalary * bonusPercentage / 100);
    }

    public int calculateAdditionalVacation() {
        if (yearsOfService() >= 5) {
            return 5;
        }
        return 0;
    }

    private int yearsOfService() {
        return java.time.Period.between(
                getHireDate(), LocalDate.now()
        ).getYears();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Monthly Salary: " + monthlySalary
                + ", Vacation Days: " + vacationDays
                + ", Bonus Percentage: " + bonusPercentage
                + ", Health Insurance: " + hasHealthInsurance;
    }
}

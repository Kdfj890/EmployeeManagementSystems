/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.time.LocalDate;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Department department = new Department(
                1, "IT", null, new ArrayList<>()
        );

        
        CommissionEmployee emp1 = new CommissionEmployee(
                101, "Ahmed", Gender.MALE,
                LocalDate.of(2022, 1, 10),
                5000, 0.10, 10000
        );

        // Create a monthly employee
        MonthlyEmployee emp2 = new MonthlyEmployee(
                102, "Shaimaa", Gender.FEMALE,
                LocalDate.of(2020, 5, 15),
                8000, 21, 10, true
        );

        // Create an hourly employee
        HourlyEmployee emp3 = new HourlyEmployee(
                103, "Mohamed", Gender.MALE,
                LocalDate.of(2024, 3, 1),
                50, 170, 75
        );

        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

     
        System.out.println("=== Employees ===");
        department.printAllEmployees();

    
        System.out.println("\n=== Salaries ===");
        System.out.println(emp1.getName() + ": "
                + emp1.calculateSalary());
        System.out.println(emp2.getName() + ": "
                + emp2.calculateSalary());
        System.out.println(emp3.getName() + ": "
                + emp3.calculateSalary());

        System.out.println("\nTotal Payroll: "
                + department.calculateTotalPayroll());

        Employee found = department.findEmployee(102);

        System.out.println("\n=== Search Result ===");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee not found");
        }
    }
}


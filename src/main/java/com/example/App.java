
package com.example;

public class App {

    // Calculate HRA (20% of Basic Salary)
    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    // Calculate DA (10% of Basic Salary)
    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    // Calculate Gross Salary
    public static double calculateGrossSalary(double basicSalary) {
        return basicSalary + calculateHRA(basicSalary)
                + calculateDA(basicSalary);
    }

    // Calculate Tax (5% of Gross Salary)
    public static double calculateTax(double grossSalary) {
        return grossSalary * 0.05;
    }

    // Calculate Net Salary
    public static double calculateNetSalary(double basicSalary) {
        double grossSalary = calculateGrossSalary(basicSalary);
        double tax = calculateTax(grossSalary);
        return grossSalary - tax;
    }

    // Main Method
    public static void main(String[] args) {

        String employeeName = "Madhu";
        double basicSalary = 30000;

        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double grossSalary = calculateGrossSalary(basicSalary);
        double tax = calculateTax(grossSalary);
        double netSalary = calculateNetSalary(basicSalary);

        System.out.println("================================");
        System.out.println("     EMPLOYEE SALARY DETAILS");
        System.out.println("================================");

        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Tax (5%)      : " + tax);
        System.out.println("--------------------------------");
        System.out.println("Net Salary    : " + netSalary);

        System.out.println("================================");
    }
}

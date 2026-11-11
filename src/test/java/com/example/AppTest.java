
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    // Test 1: Calculate HRA
    @Test
    public void testCalculateHRA() {
        assertEquals(6000.0, App.calculateHRA(30000), 0.01);
    }

    // Test 2: Calculate DA
    @Test
    public void testCalculateDA() {
        assertEquals(3000.0, App.calculateDA(30000), 0.01);
    }

    // Test 3: Calculate Gross Salary
    @Test
    public void testCalculateGrossSalary() {
        assertEquals(39000.0, App.calculateGrossSalary(30000), 0.01);
    }

    // Test 4: Calculate Tax
    @Test
    public void testCalculateTax() {
        assertEquals(1950.0, App.calculateTax(39000), 0.01);
    }

    // Test 5: Calculate Net Salary
    @Test
    public void testCalculateNetSalary() {
        assertEquals(37050.0, App.calculateNetSalary(30000), 0.01);
    }

    // Test 6: Test with zero salary
    @Test
    public void testZeroSalary() {
        assertEquals(0.0, App.calculateNetSalary(0), 0.01);
    }
}

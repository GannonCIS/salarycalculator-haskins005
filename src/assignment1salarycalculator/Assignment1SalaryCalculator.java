/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int perHour = 13;
        int yearly = 30000;
        double taxRate = .22;
        
        Calculator calc = new Calculator();
        calc.calcSalary(13);
        calc.calcHourly(yearly);
        calc.takeHomePerMonth(yearly, taxRate);
        calc.calcTaxes(yearly, taxRate);
        
    }
    
}

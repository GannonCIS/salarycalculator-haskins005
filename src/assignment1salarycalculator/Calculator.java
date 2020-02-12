/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author Darkhunter257
 */
public class Calculator {
    
    public int calcSalary(int hourlyRate){ //finds yearly salary
        int salary = 2080 * hourlyRate; //52 weeks of 40 hrs
        System.out.println("+$" + salary + " per year.");
        return salary;
    } 
   
    public double calcHourly(int salary){ //finds hourly wage
        double hourly = salary/2080; //given previouse work hours
        System.out.println("+$" + hourly + " per hour.");
        return hourly;
    }
    
    public double takeHomePerMonth(int salary, double taxRate){ //per month
        int monthly = salary/12; //assuming salary is still a yearly amount
        double takeHome = monthly - (monthly*taxRate);
        System.out.println("+$" + takeHome + " per month.");
        return takeHome;
    }
    
    public double calcTaxes(int salary, double taxRate){//returns tax per year
        double tax = salary*taxRate;
        System.out.println("-$" + tax + " per year.");
        return tax;
    }
    
}

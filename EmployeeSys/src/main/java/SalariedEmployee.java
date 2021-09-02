/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RamezSushi
 */
public class SalariedEmployee extends Employee implements Displayable {
    
    double salary;
    double bounus;
    double deductions; 

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, double bounus, double deductions, String Name, int age, String Address) {
        super(Name, age, Address);
        this.salary = salary;
        this.bounus = bounus;
        this.deductions = deductions;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBounus(double bounus) {
        this.bounus = bounus;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getSalary() {
        return salary;
    }

    public double getBounus() {
        return bounus;
    }

    public double getDeductions() {
        return deductions;
    }
    
    public double Earnings()
    {
       return (salary + bounus - deductions); 
    }
    
     public void DispEarn()
    {
    System.out.println("Earnings" + Earnings());    
    } 
    public void DispDetails()
    {
     System.out.println(super.toString());
    System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bounus=" + bounus + ", deductions=" + deductions + '}';
    }
    
    
    
    
}

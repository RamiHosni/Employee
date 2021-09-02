/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RamezSushi
 */
public class BasePlusCommEmployee extends CommEmp {
    
    double base; 

    public BasePlusCommEmployee() {
    }

    public BasePlusCommEmployee(double base, double GrossSalary, double CommRate, String Name, int age, String Address) {
        super(GrossSalary, CommRate, Name, age, Address);
        this.base = base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    
     // @override
    
    public double Earnings()
    {
     return (base + super.Earnings());   
    
    }
    
    public void DispEarn()
    {
    System.out.println("Earnings" + Earnings());
    }
    public void DispDetails()
    {
    super.DispDetails();
    }

    @Override
    public String toString() {
        return "BasePlusCommEmployee{" + "base=" + base + '}';
    }
    
    
}


    
    
    


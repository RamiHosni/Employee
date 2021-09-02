/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RamezSushi
 */
public class HourlyEmployee extends Employee implements  Displayable {
    
    double HourRate; 
    int NumberOfHours; 

    public HourlyEmployee() {
    }

    public HourlyEmployee(double HourRate, int NumberOfHours, String Name, int age, String Address) {
        super(Name, age, Address);
        this.HourRate = HourRate;
        this.NumberOfHours = NumberOfHours;
    }

    

    public void setHourRate(double HourRate) {
        this.HourRate = HourRate;
    }

    public void setNumberOfHours(int NumberOfHours) {
        this.NumberOfHours = NumberOfHours;
    }

    public double getHourRate() {
        return HourRate;
    }

    public int getNumberOfHours() {
        return NumberOfHours;
    }
    
     public double Earnings()
    {
     return (HourRate * NumberOfHours);   
    
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
        return "HourlyEmployee{" + "HourRate=" + HourRate + ", NumberOfHours=" + NumberOfHours + '}';
    }
    
    
    
    
    
}

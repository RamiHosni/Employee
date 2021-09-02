/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RamezSushi
 */
public class CommEmp extends Employee implements Displayable {
    
    double GrossSalary; 
    double CommRate; 

    public double getGrossSalary() {
        return GrossSalary;
    }

    public double getCommRate() {
        return CommRate;
    }

    public void setGrossSalary(double GrossSalary) {
        this.GrossSalary = GrossSalary;
    }

    public void setCommRate(double CommRate) {
        this.CommRate = CommRate;
    }

    public CommEmp() {
    }

    public CommEmp(double GrossSalary, double CommRate, String Name, int age , String Address) {
        super(Name, age, Address);
        this.GrossSalary = GrossSalary;
        this.CommRate = CommRate;
    }
    

    public static String getCompanyName() {
        return CompanyName;
    }

    public static String getFax() {
        return fax;
    }
    
   // @override
    
    public double Earnings()
    {
     return (GrossSalary + CommRate);   
    
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
        return "CommEmp{" + "GrossSalary=" + GrossSalary + ", CommRate=" + CommRate + '}';
    }
    
    
}

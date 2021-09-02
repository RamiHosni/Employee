/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RamezSushi
 */


public abstract class Employee {
    
    String Name; 
    int age ; 
    String Address; 

    public Employee(String Name, int age, String Address) {
        this.Name = Name;
        this.age = age;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
  public Employee()
 
  {
  }
  
  public abstract double Earnings();

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", age=" + age + ", Address=" + Address + '}';
    }
  





    
    
   
    
    
}

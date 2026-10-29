/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappf2;

/**
 *
 * @author Administrator
 */
public class Employee extends Person {
    private double salary;
    private String job; 
    
    Employee() {
        super();
        salary = 0.0;
        job = "";
    }
    
    Employee(double salary, String job) {
        super();
        this.salary = salary;
        this.job = job;
    }
    
    Employee(String name, double age, double salary, String job) {
        super(name, age);
        this.salary = salary;
        this.job = job;
    }

    Employee(String name, double age, int gender, double salary, String job) {
        super(name, age, gender);
        this.salary = salary;
        this.job = job;
    }
    
    public void setSalary(double salary) {
        if (salary>=0)
            this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setJob(String job) {
        this.job = job;
    }
    
    public String getJob() {
        return job;
    }    

    //Method Overriding
    public String description() {
        String s = "Employee: "+getName()+", είναι "+getAge();
        s = s+" και εργάζεται ως "+job+" με μισθό "+salary;
        return s;
    }
    
}

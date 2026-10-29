/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappf2;

/**
 *
 * @author Administrator
 */
public class Person {
    public final static int MALE = 1;
    public final static int FEMALE = 2;
    public final static int NOGENDER = 3;
    private String name;
    private double age;
    private int gender;
    
    Person() {
       name = "";
       age = 0.0;
       gender = NOGENDER;
    }
    
    Person(String name, double age) {
        this.name = name;
        this.age = age;
        gender = NOGENDER;
    }
    
    Person(String name, double age, int gender) {
        this.name = name;
        this.age = age;
        setGender(gender);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double a) {
        age = a;
    }    
    
    public int getGender() {
        return gender;
    }
    
    public void setGender(int a) {
        if (a==MALE || a==FEMALE)
            gender = a;
        else
            gender = NOGENDER;
    }    
    
    public String description() {
        String g;
        if (gender==MALE)
            g="Person: O "+name+" είναι "+age+" χρονών. Gender="+gender;
        else 
            if (gender==FEMALE)
                g="Person: H "+name+" είναι "+age+" χρονών. Gender="+gender;
            else
                g="Person: "+name+", είναι "+age+" χρονών. Gender="+gender;
        return g;
    }
}

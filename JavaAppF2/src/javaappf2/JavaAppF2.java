/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaappf2;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaAppF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String onoma, tmp;
        double ilikia;
        int done;
        Person per1, per2, per3;
        Person p1, p2, p3;
            
        p1 = new Person("Ελένη", 38, 22);
        p2 = new Person("Δημήτρης", 28, Person.MALE);
        p3 = new Person("Ιωάννα", 23.5);
        p3.setGender(Person.FEMALE);
        
        System.out.println(p1.description());
        System.out.println(p2.description());
        System.out.println(p3.description());
        
        per1 = new Person();
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Δώσε όνομα: ");
                onoma = sc.nextLine();
                System.out.print("Δώσε ηλικία: ");
                tmp = sc.nextLine(); 

                ilikia = Double.parseDouble(tmp);
                per1 = new Person(onoma, ilikia);
                System.out.println(per1.description());
                done = 1;
            } catch (NullPointerException e) {
                System.out.println("Δόθηκε null string. "+e.getMessage());
                done = 0;
            } catch (NumberFormatException e) {
                System.out.println("Δεν δόθηκε πραγματικός αριθμός. "+e.getMessage());
                done = 0;
            }
        
        } while (done!=1);
    
        Employee emp1, emp2;
        emp1 = new Employee(1200.5, "Εκπαιδευτικός");
        emp2 = new Employee("Χρήστος", 25.6, Person.MALE, 1400, "Ηλεκτρολόγος");
        
        emp1.setAge(32);
        emp1.setName("Κώστας");
        System.out.println(emp1.description());
        System.out.println(emp2.description());
        
        ArrayList<Person> persons;
        persons = new ArrayList<Person>();
        
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(emp1);
        persons.add(emp2);
        persons.add(per1);
        
        System.out.println(persons.size());
        System.out.println("-------------------------");
        for (int i=0;i<persons.size();++i)
            System.out.println(persons.get(i).description());
        
        System.out.println("-------------------------");
        for (Person p:persons)
            System.out.println(p.description());
        
        System.out.println("-------------------------");
        for (int i=0;i<persons.size();++i) {
            Person p = persons.get(i);
            if (p instanceof Employee)
                System.out.println("Το στοιχείο "+i+" είναι Employee.");
            else
                System.out.println("Το στοιχείο "+i+" είναι Person.");
  
        }
            
    }
    
    
    
}

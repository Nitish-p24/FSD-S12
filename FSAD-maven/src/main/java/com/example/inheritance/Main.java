package com.example.inheritance;

import com.example.encapsulation.Student;
import com.example.interfaces.*;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        s.setId(101);
        s.setName("Nitish");
        s.display();

        System.out.println("------------");

        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();
        d1.draw();
        d2.draw();

        System.out.println("------------");

        SavingsAccount sa = new SavingsAccount(10000);
        sa.showBalance();
        sa.calculateInterest();
        sa.showBalance();
    }
    //system.out.println("---------------");
}

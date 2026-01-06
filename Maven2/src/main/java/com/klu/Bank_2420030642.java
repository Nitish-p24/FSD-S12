/*Write a Java program to demonstrate method overriding by creating a superclass 
  Bank with a method to return interest rate. Override this method 
  in subclasses such as SBI and HDFC.*/

package com.klu;

class Bank {
    public double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class HDFC extends Bank {
    
    public double getInterestRate() {
        return 6.0;
    }
}

public class Bank_2420030642 {

    public static void main(String[] args) {

        Bank bank1 = new SBI();
        Bank bank2 = new HDFC();

        System.out.println("SBI Interest Rate: " + bank1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + bank2.getInterestRate() + "%");
    }
}


/*Write a Java program to demonstrate multilevel inheritance by creating classes Vehicle, Car, and 
  ElectricCar. Each class should have its own method. Show how methods of all parent classes are accessible
  by the child class.*/
package com.klu;

class Car extends vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Electric car battery is on charge state");
    }
}

public class vehicle {

    void start() {
        System.out.println("vehicle will Start ");
    }

    public static void main(String[] args) {

        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.chargeBattery();
    }
}


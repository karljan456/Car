package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Car {

    public String brand;
    public int model;
    public int amountOfFuel;

    public Car(String brand, int model, int amountOfFuel){

        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;

    }


    public void brake() {

        System.out.println("Car is breaking");

    }

    public void accelerate() {

        if (amountOfFuel > 0) {

            System.out.println("Car is accelerating");

            amountOfFuel--;
        }else{

            System.out.println("Refill the tank!");

        }


    }

    public void printData() {

        System.out.println("The brand is " + brand + ". The model is " + model + ". Amount of fuel left: "
                + amountOfFuel + " litres.");

    }

    public void refuel(int amount){

        System.out.println("Fuel on the tank: " + amount);
        System.out.println("Refuel: 5");
        amount += 5;
        System.out.println("Fuel on the tank after the refuel: " + amount);

    }

}
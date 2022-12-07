package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Fiat", 500, 50);

//        car.printData();
        car.accelerate();
        car.brake();
//        car.printData();
        car.refuel(car.amountOfFuel);
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
        printData();
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

    private void printData() {

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
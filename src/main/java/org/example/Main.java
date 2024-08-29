package org.example;
//Package apparently equals folder name don't ask questions that's not why you're in class.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Okay it turns out there's other things that are actually what I needed to do.
public class Main {
    public static void main(String[] args) {
        //Creating 2 vehicles to make sure they work
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(2, "Jet Black", 4.0f, "Soylent");

        //Creating the 2 cars, one without and one with arguments
        Car c1 = new Car();
        Car c2 = new Car(4, "Red", 80.0f, "Gasoline", "Wumpus Incorporated");

        //Testing honk and display on both cars.
        c1.honk();
        c1.displayInfo();

        c2.honk();
        c2.displayInfo();
    }
}

class Vehicle {
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;

    //Creates a new Vehicle with default attributes
    public Vehicle() {
        numberOfWheels = 4;
        color = "Blue";
        engineSize = 40.0f;
        fuelType = "Magic";
    }

    //Creates a new Vehicle with provided attributes
    public Vehicle(int wheels, String hue, float size, String fuel) {
        numberOfWheels = wheels;
        color = hue;
        engineSize = size;
        fuelType = fuel;
    }

    //Setters and Getters for each variable in the Vehicle class
    public void setNumberOfWheels(int num){
        numberOfWheels = num;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setColor(String hue){
        color = hue;
    }

    public String getColor() {
        return color;
    }

    public void setEngineSize(float size){
        engineSize = size;
    }

    public float getEngineSize(){
        return engineSize;
    }

    public void setFuelType(String type){
        fuelType = type;
    }

    public String getFuelType(){
        return fuelType;
    }
}

class Car extends Vehicle{
    String brand;

    //Creates a new car by referencing it's super and providing a default value.
    public Car(){
        super();
        brand = "Wumpus Incorporated";
    }

    //Creates a new car by referencing it's super, using provided values.
    public Car(int num, String hue, float size, String type, String producer){
        super(num, hue, size, type);
        brand = producer;
    }

    //Set and Get for the Car specific value, Brand
    public void setBrand(String producer){
        brand = producer;
    }

    public String getBrand(){
        return brand;
    }

    //Print all values in the Car class.
    public void displayInfo(){
        System.out.println(brand);
        System.out.println(numberOfWheels);
        System.out.println(color);
        System.out.println(engineSize);
        System.out.println(fuelType);
    }

    //Honk.
    public void honk(){
        System.out.println("Honk Honk!");
    }
}

//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Mar 19 2019       --
//-- Created for:    Unit 2-05         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program creates a class      --
//-- vehicle with fields and methods   --
//---------------------------------------

import java.util.*;

public class Vehicle {

    // Intro fields
    private Integer       licensePlateNumber;
    private String        colour;
    private Integer       numberOfDoors;
    private final Integer speed = 100;
    private final Integer maxSpeed = 180;

    // Constructor
    public Vehicle (int licensePlateNumber, String colour, Integer numberOfDoors) {

        this.licensePlateNumber = licensePlateNumber;
        this.colour             = colour;
        this.numberOfDoors      = numberOfDoors;

    }

    protected void accelerate() {
        
    }

    protected void brake() {

    }

    public String toString() {
        
        
        
        return "hi";
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle licence plate number:");
        int licensePlateNumber = scanner.nextInt();
        System.out.println("Enter vehicle colour:");
        String colour = scanner.next();
        System.out.println("Enter vehicle number of doors: ");
        int numberOfDoors = scanner.nextInt();
        Vehicle vehicle = new Vehicle(licensePlateNumber, colour, numberOfDoors);
        System.out.println(vehicle.toString());
    }
}
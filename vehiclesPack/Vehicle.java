
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


//, Integer speed, Integer maxSpeed


import java.util.*;

public class Vehicle {

    public  Scanner scanner = new Scanner(System.in);
    // Intro fields
    private Integer       licensePlateNumber;
    private String        colour;
    private Integer       numberOfDoors;
    public Integer       speed;
    private Integer       maxSpeed;

    // Constructor
    // public Vehicle (int licensePlateNumber, String colour, Integer numberOfDoors, Integer speed, Integer maxSpeed) {

    //     this.licensePlateNumber = licensePlateNumber;
    //     this.colour             = colour;
    //     this.numberOfDoors      = numberOfDoors;
    //     this.speed              = speed;
    //     this.maxSpeed           = maxSpeed;

    // }

    protected ArrayList create(Scanner scanner) {
        //Scanner scanner = new Scanner(System.in);

        System.out.println("How many vehicles do you want to create?");
        int howMany = scanner.nextInt();
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();

        for (int counter = 0; counter < howMany; counter ++) {

            System.out.println("\n\n===================================");
            System.out.println("===\tCreating Vehicle #" + (counter + 1) + "\t===\n");
            
            Vehicle vehicle = new Vehicle();
            vehicle.getInfo();

            list.add(vehicle);
        }

        for (int count = 0; count < howMany; count ++) {

            System.out.println("\n\n===================================");
            System.out.println("======\t     Vehicle #" + (count + 1) + "      ======\n");
            list.get(count).toString();
            System.out.println("\n===================================");

        }
        
        return list;
    }
    protected void accelerate(ArrayList list, Scanner scanner) {
        System.out.println("For which vehicle?");
        int vNumber = scanner.nextInt();
        //list.get(vNumber).speed += list.get(vNumber).speed;
        System.out.println("Speeding up!");
    }

    protected void brake(ArrayList list, Scanner scanner) {
        System.out.println("For which vehicle?");
        int vNumber = scanner.nextInt();
        //list.get(vNumber).speed = 0;
        System.out.println("Brake!");

    }

    public void getInfo() {
        
        System.out.println("Enter vehicle licence plate number:");
        this.licensePlateNumber = scanner.nextInt();
        System.out.println("Enter vehicle colour:");
        this.colour = scanner.next();
        System.out.println("Enter vehicle number of doors: ");
        this.numberOfDoors = scanner.nextInt();
        System.out.println("Enter vehicle speed:");
        this.speed = scanner.nextInt();
        System.out.println("Enter vehicle max speed: ");
        this.maxSpeed = scanner.nextInt();
    } 

    public String toString() {
        
        System.out.println("===\tLicence Plate:\t" + this.licensePlateNumber + "\t===" );
        System.out.println("===\tColour:\t\t" + this.colour + "\t===" );
        System.out.println("===\tDoors:\t\t" + this.numberOfDoors  + "\t===");
        System.out.println("===\tSpeed:\t\t" + this.speed + "\t===" );
        System.out.println("===\tMaximum Speed:\t" + this.maxSpeed + "\t===" );

        return "";
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Vehicle v = new Vehicle();
        boolean run = true;
        ArrayList list = null;

        while (run) {

            System.out.println("What do you want to do? ( C = Create, A = Accelerate, B = Brake, E = Exit ) ");
            String response = scanner.nextLine();
            switch (response) {
                case "C":
                    list = v.create(scanner);
                    break;
            
                case "A":
                    v.accelerate(list, scanner);
                    break;
                    
                case "B":
                    v.brake(list, scanner);
                    break;
                case "E":
                    run = false;

                System.out.println(run);
            }

        }
        
        
        

        scanner.close();
    }
}
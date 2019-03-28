//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Mar 25 2019       --
//-- Created for:    Unit 2-05         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- Practicing getter and setter :)
import java.util.Scanner;

public class Airplane {

    public Scanner scanner = new Scanner(System.in);

    // Intro fields
    private Integer       speed;

    public Integer getSpeed () {

        return this.speed;
    }

    public Integer setSpeed (Integer speed) {

        return this.speed = speed;
    }

    public static void main(String[] args) {

        // Airplane ap = new Airplane();

        // System.out.println("enter it:");
        // int input = ap.scanner.nextInt();
        // ap.setSpeed(input);
        // System.out.println("ok");
        // System.out.println(ap.getSpeed());

        System.out.println("     :::: DONE! ::::     ");
    }
}
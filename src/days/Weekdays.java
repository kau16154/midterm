/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */


import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7):");
        int dayNumber = in.nextInt();

     
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
            return;
        }

        Day day = Day.values()[dayNumber - 1]; 
        System.out.println("Day name: " + day.getDayName());

     
        System.out.println("All days of the week:");
        for (Day d : Day.values()) {
            System.out.println(d.getDayName());
        }
    }
}
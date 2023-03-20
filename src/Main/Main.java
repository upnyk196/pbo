/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author User
 */
import java.util.Scanner;

interface CalculateFlatField {
    double calculateArea();
    double calculatePerimeter();
}

interface CalculateSpace {
    double calculateVolume();
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        double length, width, height, radius;
        
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Calculate the area and volume of a beam");
            System.out.println("2. Calculate the area and volume of a cylinder");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the beam: ");
                    length = input.nextDouble();
                    System.out.print("Enter the width of the beam: ");
                    width = input.nextDouble();
                    System.out.print("Enter the height of the beam: ");
                    height = input.nextDouble();
                    
                    Beam beam = new Beam(length, width, height);
                    System.out.println("Area of the rectangle: " + beam.calculateArea());
                    System.out.println("Circumference of the rectangle: " + beam.calculatePerimeter());
                    System.out.println("Volume of the beam: " + beam.calculateVolume());
                    break;
                    
                case 2:
                    System.out.print("Enter the radius of the cylinder: ");
                    radius = input.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    height = input.nextDouble();
                    
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println("Area of the circle: " + cylinder.calculateArea());
                    System.out.println("Circumference of the circle: " + cylinder.calculatePerimeter());
                    System.out.println("Volume of the cylinder: " + cylinder.calculateVolume());
                    break;
                    
                case 3:
                    System.out.println("Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
        
        input.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coremathlibraryy;

import java.util.Scanner;

public class MathLibraryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Core Math Library (OOP Implementation) ===");

        while (running) {
            System.out.println("\nSelect a Problem/Module:");
            System.out.println("1. Problem 1: Arithmetic Operations");
            System.out.println("2. Problem 2: Geometry Computations");
            System.out.println("3. Problem 3: Number Analysis");
            System.out.println("4. Problem 4: Hierarchy Design Info");
            System.out.println("5. Problem 5: Extensibility Demo");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ArithmeticOps math = new ArithmeticOps();
                    System.out.print("Enter first number: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b1 = scanner.nextDouble();
                    math.setInputs(a1, b1);
                    System.out.println("Addition: " + math.add());
                    System.out.println("Subtraction: " + math.subtract());
                    System.out.println("Multiplication: " + math.multiply());
                    System.out.println("Division: " + math.divide());
                    break;

                case 2:
                    GeometryOps geo = new GeometryOps();
                    System.out.println("  A. Circle");
                    System.out.println("  B. Rectangle");
                    System.out.print("  Select shape: ");
                    String input = scanner.next();
                    char shape = input.toUpperCase().charAt(0);

                    if (shape == 'A') {
                        System.out.print("Enter Radius: ");
                        geo.setOperand1(scanner.nextDouble());
                        System.out.println("Circle Area: " + geo.circleArea());
                        System.out.println("Circumference: " + geo.circleCircumference());
                    } else if (shape == 'B') {
                        System.out.print("Enter Length: ");
                        double l = scanner.nextDouble();
                        System.out.print("Enter Width: ");
                        double w = scanner.nextDouble();
                        geo.setInputs(l, w);
                        System.out.println("Rectangle Area: " + geo.rectangleArea());
                        System.out.println("Perimeter: " + geo.rectanglePerimeter());
                    }
                    break;

                case 3:
                    NumberAnalysis numOp = new NumberAnalysis();
                    System.out.print("Enter a number to analyze: ");
                    numOp.setOperand1(scanner.nextDouble());
                    System.out.println("Is Prime? " + numOp.isPrime());
                    System.out.println("Factorial: " + numOp.factorial());
                    System.out.println("Type: " + numOp.checkEvenOdd());
                    break;

                case 4:
                    System.out.println("\n[Design Hierarchy Visualization]");
                    System.out.println("Base Class: MathematicalOperation");
                    System.out.println("  +-- ArithmeticOps");
                    System.out.println("  +-- GeometryOps");
                    System.out.println("  +-- NumberAnalysis");
                    break;

                case 5:
                    TrigonometryOps trig = new TrigonometryOps();
                    System.out.print("Enter angle in degrees: ");
                    trig.setOperand1(scanner.nextDouble());
                    System.out.printf("Sine: %.4f\n", trig.getSine());
                    System.out.printf("Cosine: %.4f\n", trig.getCosine());
                    break;

                case 0:
                    running = false;
                    System.out.println("Exiting Library...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
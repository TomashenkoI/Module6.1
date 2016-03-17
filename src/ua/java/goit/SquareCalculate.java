package ua.java.goit;

import java.util.Scanner;

/**
 * Created by 7 on 17.03.2016.
 */
public class SquareCalculate {

    public static void main(String[] args) {

        Scanner inputtedRadius = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        final String R = inputtedRadius.next();

        try {
            final int radius = Integer.parseInt(R);
            double CircleSquare;
            double Pi = 3.14d;
            CircleSquare = Pi*radius*radius;
            System.out.println("Circle Square is = "+CircleSquare);
        }
        catch (NumberFormatException ex) {
            System.out.println("Radius should be a number!");
        }

        System.out.println();

        Scanner inputtedSideA = new Scanner(System.in);
        System.out.println("Enter size of rectangle's side A:");
        final String SideAOfRectangle = inputtedSideA.next();

        Scanner inputtedSideB = new Scanner(System.in);
        System.out.println("Enter size of rectangle's side B:");
        final String SideBOfRectangle = inputtedSideB.next();

        try {
            final int IntSideAOfRectangle = Integer.parseInt(SideAOfRectangle);
            final int IntSideBOfRectangle = Integer.parseInt(SideBOfRectangle);
            int RectangleSquare;
            RectangleSquare = IntSideAOfRectangle*IntSideBOfRectangle;
            System.out.println("Rectangle Square is = "+RectangleSquare);
        }
        catch (NumberFormatException ex) {
            System.out.printf("Size should be a number!");
        }

        System.out.println();

        Scanner inputtedSideAOfTriangle = new Scanner(System.in);
        System.out.println("Enter size of triangle's size A:");
        final String SideAOfTriangle = inputtedSideAOfTriangle.next();

        Scanner inputtedSideBOfTriangle = new Scanner(System.in);
        System.out.println("Enter size of triangle's size B:");
        final String SideBOfTriangle = inputtedSideBOfTriangle.next();

        try {
            final int IntSideAOfTriangle = Integer.parseInt(SideAOfTriangle);
            final int IntSideBOfTriangle = Integer.parseInt(SideBOfTriangle);
            int TriangleSquare;
            TriangleSquare = IntSideAOfTriangle*IntSideBOfTriangle/2;
            System.out.println("Triangle Square is = "+TriangleSquare);
        }
        catch (NumberFormatException ex) {
            System.out.println("Size should be a number!");
        }
    }
}

package org.irush.study.elementary.chapter_02;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        //double radius = input.nextDouble();
        double radius = 2;
        double area = areaC(radius);

        // Display results //instead of 'Log' System.out.println
         System.out.println("The area for the circle of radius " +
         radius + " is " + area);

    }
public static double areaC (double radius){
return radius * radius * 3.1417;
}

}

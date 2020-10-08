package exercise2;

import java.util.Scanner;

public class Circle{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a radius: ");
    double r = input.nextDouble();
    double c = 2.0*r*Math.PI;
    double a = 2.0*r*r*Math.PI;
    System.out.println("Circumference: "+c);
    System.out.println("Area: "+a);
  }
}
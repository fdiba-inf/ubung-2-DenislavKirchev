package exercise2;

import java.util.Scanner;

public class Circle{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a radius: ");
    int r = input.nextInt();
    double c = 2*r*3.14;
    double a = 2*r*r*3.14;
    System.out.println("Circumference: "+c);
    System.out.println("Area: "+a);
  }
}
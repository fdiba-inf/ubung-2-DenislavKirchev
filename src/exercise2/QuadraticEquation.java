package exercise2;

import java.util.Scanner;

public class QuadraticEquation{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a: ");
    double a = input.nextDouble();
    System.out.print("Enter b: ");
    double b = input.nextDouble();
    System.out.print("Enter c: ");
    double c = input.nextDouble();

    if(a!=0){
      double d = b*b-4.0*a*c;
      if(d>=0){
        double x1= (-b+Math.sqrt(d))/(2.0*a);
        double x2= (-b+Math.sqrt(d))/(2.0*a);
        System.out.print(x1 + ", " + x2);
      }
      else{
        System.out.print("Imaginary values");
      }
    }
    else if(b!=0){
      double x = -c/a;
      System.out.println(x);
    }
    else if(c!=0){
      System.out.println("No values");
    }
    else{
      System.out.println("Many values");
    }
    
  }
}
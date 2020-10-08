package exercise2;

import java.util.Scanner;

public class QuadraticEquation{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = input.nextInt();
    System.out.print("Enter b: ");
    int b = input.nextInt();
    System.out.print("Enter c: ");
    int c = input.nextInt();

    if(a!=0){
      double d = b*b-4*a*c;
      if(d>=0){
        double x1= (-b+Math.sqrt(d))/2*a;
        double x2= (-b+Math.sqrt(d))/2*a;
        System.out.print("X1= "+x1+"X2= "+x2);
      }
      else{
        System.out.print("Imaginary values");
      }
    }
    else if(b!=0){
      double x = -c/a;
      System.out.print("X=+/-"+x);
    }
    else if(c!=0){
      System.out.print("No values");
    }
    else{
      System.out.print("Many values");
    }
    
  }
}
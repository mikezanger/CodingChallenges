package Week_1Challenge;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println(calcArea(3, 2));
        System.out.println(calcArea(7, 4));
        System.out.println(calcArea(10, 10 ));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base length");
        double base = input.nextDouble();
        System.out.println("Please enter the height");
        double height = input.nextDouble();
        System.out.println("The area of a triangle is " + calcArea(base, height));


    }
    public static double calcArea(double base, double height){
        return (base * height) / 2;
    }


}
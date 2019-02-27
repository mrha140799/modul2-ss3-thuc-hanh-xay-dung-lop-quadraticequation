package QuadraticEquation;

import java.util.Scanner;

public class InitQuadraticEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a  = ");
        double a = scn.nextDouble();
        System.out.println("Enter b = ");
        double b = scn.nextDouble();
        System.out.println("Enter c  = ");
        double c = scn.nextDouble();
        QuadraticEquation qd = new QuadraticEquation(a , b, c);
        System.out.println(a+"x^2" + " + " + b+"x" + " + " +"c");
        System.out.println(" Discriminant = " + qd.getDiscriminant());
    }
}

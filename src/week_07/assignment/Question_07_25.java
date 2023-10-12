package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c : ");

        int[] eqn = new int[3];

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextInt();
        }

        double[] roots = new double[0];

       if(solveQuadratic(eqn) == 0){
           System.out.println("The equation has no real root.");
       }
       if (solveQuadratic(eqn) == 1){
           System.out.println("The number of real roots : " + solveQuadratic(eqn));
           roots = new double[solveQuadratic(eqn)];
           roots[0] = -eqn[1] - (double) findDiscriminant(eqn) / 2 * eqn[0];
           System.out.print("The root(s) of equation : ");
           print(roots);
       }
       if(solveQuadratic(eqn) == 2){
           System.out.println("The number of real roots : " + solveQuadratic(eqn));
           roots = new double[solveQuadratic(eqn)];
           roots[0] = (double)(-eqn[1] - findDiscriminant(eqn)) / 2 * eqn[0];
           roots[1] = (double)(-eqn[1] + findDiscriminant(eqn)) / 2 * eqn[0];
           System.out.print("The root(s) of equation : ");
           print(roots);
       }


    }

    public static void print(double[] roots) {
        for (double d : roots) {
            System.out.print(d + " ");
        }
    }

    public static int findDiscriminant(int[] eqn) {
        return eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
    }

    public static int solveQuadratic(int[] eqn){
        int numberOfRoots = 0;

        if(findDiscriminant(eqn) > 0){
            numberOfRoots = 2;

        }

        if(findDiscriminant(eqn) == 0){
            numberOfRoots = 1;

        }

        return numberOfRoots;
    }

}

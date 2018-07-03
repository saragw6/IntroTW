package com.company;
import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Single();
        Horizontal(in);
        Vertical(in);
        Right(in);
        Isosceles(in);
        Diamond(in);
        DiamondWithName(in);
        FizzBuzz();
        System.out.println("Enter n to generate primes:");
        Integer n = Integer.parseInt(in.nextLine());
        System.out.println(Generate(n));

    }

    private static String Generate(Integer n) {

        String factors = "";

        int i = 2;
        while (n % i != 0) { i++; }
        factors += Integer.toString(i);

        if (n /i > 2) {factors += ", " + Generate(n/i);}

        return factors;
    }


    private static void PrintLnFizzBuzz(Integer n) {
        if (n % 3 == 0) {
            System.out.print("Fizz");
        }
        if (n % 5 == 0) {
            System.out.print("Buzz");
        } else if (n % 3 != 0) {
            System.out.print(n);
        }

        System.out.println();

    }


    private static void FizzBuzz() {
        for (int i = 1; i < 101; i++) {
            PrintLnFizzBuzz(i);
        }
    }

    private static void DiamondWithName(Scanner in) {
        System.out.println("Enter n for diamond with name:");
        Integer diamond = Integer.parseInt(in.nextLine());


        for (int i = 0; i < diamond - 1; i++) {
            leftSideTriangle(diamond - (i + 1), i);
            System.out.print('*');
            rightSideTriangle(diamond - (i + 1), i);
            System.out.println();
        }
        System.out.println("Sara");
        for (int j = diamond - 2; j >= 0; j--) {
            leftSideTriangle(diamond - (j + 1), j);
            System.out.print('*');
            rightSideTriangle(diamond - (j + 1), j);
            System.out.println();
        }

    }


    private static void Diamond(Scanner in) {
        System.out.println("Enter n for diamond:");
        Integer diamond = Integer.parseInt(in.nextLine());


        for (int i = 0; i < diamond; i++) {
            leftSideTriangle(diamond - (i + 1), i);
            System.out.print('*');
            rightSideTriangle(diamond - (i + 1), i);
            System.out.println();
        }
        for (int j = diamond - 2; j >= 0; j--) {
            leftSideTriangle(diamond - (j + 1), j);
            System.out.print('*');
            rightSideTriangle(diamond - (j + 1), j);
            System.out.println();
        }

    }

    private static void leftSideTriangle(Integer spaces, Integer stars) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(' ');
        }
        for (int j = 0; j < stars; j++) {
            System.out.print('*');
        }
    }

    private static void rightSideTriangle(Integer spaces, Integer stars) {
        for (int j = 0; j < stars; j++) {
            System.out.print('*');
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print(' ');
        }
    }

    private static void Isosceles(Scanner in) {
        System.out.println("Enter n for isosceles triangle:");
        Integer isosceles = Integer.parseInt(in.nextLine());

        for (int i = 0; i < isosceles; i++) {
            leftSideTriangle(isosceles - (i + 1), i);
            System.out.print('*');
            rightSideTriangle(isosceles - (i + 1), i);
            System.out.println();
        }
    }

    private static void Right(Scanner in) {
        System.out.println("Enter n for right triangle:");
        Integer right = Integer.parseInt(in.nextLine());
        for (int i = 0; i < right; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void Vertical(Scanner in) {
        System.out.println("Enter n for vertical line:");
        Integer vertical = Integer.parseInt(in.nextLine());
        for (int i = 0; i < vertical; i++) {
            Single();
        }
        System.out.println();
    }

    private static void Horizontal(Scanner in) {
        System.out.println("Enter n for horizontal line:");
        Integer horizontal = Integer.parseInt(in.nextLine());
        for (int i = 0; i < horizontal; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    private static void Single() {
        System.out.println('*');
    }
}

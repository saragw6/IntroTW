package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        single();
//        horizontal(in);
//        vertical(in);
//        right(in);
        isosceles(in);
        diamond(in);
        //leftSideDiamond(1,1);

    }


    private static void diamond(Scanner in) {
        System.out.println("Enter n for diamond:");
        Integer diamond = Integer.parseInt(in.nextLine());

        //--*-- 2, 0
        //-***- 1, 1
        //***** 0, 2

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

    private static void isosceles(Scanner in) {
        System.out.println("Enter n for isosceles triangle:");
        Integer isosceles = Integer.parseInt(in.nextLine());

        //--*-- 2, 0
        //-***- 1, 1
        //***** 0, 2

        for (int i = 0; i < isosceles; i++) {
            leftSideTriangle(isosceles - (i + 1), i);
            System.out.print('*');
            rightSideTriangle(isosceles - (i + 1), i);
            System.out.println();
        }
    }

    private static void right(Scanner in) {
        System.out.println("Enter n for right triangle:");
        Integer right = Integer.parseInt(in.nextLine());
        for (int i = 0; i < right; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void vertical(Scanner in) {
        System.out.println("Enter n for vertical line:");
        Integer vertical = Integer.parseInt(in.nextLine());
        for (int i = 0; i < vertical; i++) {
            single();
        }
        System.out.println();
    }

    private static void horizontal(Scanner in) {
        System.out.println("Enter n for horizontal line:");
        Integer horizontal = Integer.parseInt(in.nextLine());
        for (int i = 0; i < horizontal; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    private static void single() {
        System.out.println('*');
    }
}

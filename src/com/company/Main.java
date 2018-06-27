package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        single();

        horizontal(in);

        vertical(in);
    }

    private static void single() {
        System.out.println('*');
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
}

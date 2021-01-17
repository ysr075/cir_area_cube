package com.company;

import java.util.Scanner;

class circumference_cube {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n~~ in cm ~~");
        int line1;
        System.out.print("\nline1: ");
        line1 = input.nextInt();
        System.out.print("circumference of your 2D cube is " + line1 * 4 + " cm.\n");
    }
}

class area_cube {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n~~ in cm ~~");
        int base;
        System.out.print("\nbase: ");
        base = input.nextInt();
        int height;
        System.out.print("height: ");
        height = input.nextInt();
        System.out.print("area of your 2D cube is " + base * height + " cm.\n");
    }
}

public class calc_java {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        do {
            int choose;
            System.out.print("\n1.circumference or 2.area: ");
            choose = input.nextInt();
            if (choose == 1) {
                circumference_cube.StaticMethod();
            } else if (choose == 2) {
                area_cube.StaticMethod();
            } else {
                System.exit(1);
            }
        } while(true);
    }
}

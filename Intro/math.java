package Intro;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println(Math.max(a, b) + " is greater than " + Math.min(a,b));

        for (int i = 0;i < a;i++){
            System.out.println(Math.random());
        }
    }
}

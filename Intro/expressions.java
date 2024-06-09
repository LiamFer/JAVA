package Intro;

public class expressions {
    public static void main(String[] args) {

        double num = 10;
        // Casting the return as another type, but here it's actually redundant :/
        num = (double) num/3;
        System.out.println(num);

        // In Java we also have the operators + - / % and -- ++
        num--;
        System.out.println(num);
        num++;
        num++;
        System.out.println(num);

        // % Module Operator
        int test = 25;
        test = 25%4;
        System.out.println(test);
    }
}

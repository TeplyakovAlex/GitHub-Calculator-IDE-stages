package app;


public class Main {
    static int a,b,c,d,e;
    static double h;
    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        a = 8;
        b = 2;
        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);
        e = sub(a,b);
        System.out.println(e);
        h = div(a,b);
        System.out.println(h);

    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static double div(int a, int b) {
        return a / b;
    }
}

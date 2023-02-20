package chapter06;

import lib.Input;

public class Ex6_8_1 {
    public static void main(String[] args) {
        int a = Input.getInt();
        double b = Input.getDouble();
        String c = Input.getString();

        System.out.printf("%,8d%n", a);
        System.out.printf("%9.3f%n", b);
        System.out.printf("%10s%n", c);

    }
}

package chapter09;

import lib.Input;

public class Ex9_7_1 {
    public static void main(String[] args) {
        double x = Input.getDouble();
        System.out.println(x > 0 ? Math.sqrt(x): 0);
    }
}

package chapter06;

import lib.Input;

public class Ex6_3_2 {
    public static void main(String[] args) {
        int n = Input.getInt("整数値");
        System.out.println("12で割った余り=" + (n % 12));
    }
}

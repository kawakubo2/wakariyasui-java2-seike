package chapter09;

import lib.Input;

public class Ex9_5 {
    public static void main(String[] args) {
        int year = Input.getInt("年");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%d年は閏年です。%n", year);
        } else {
            System.out.printf("%d年は閏年ではありません。%n", year);
        }
    }
}

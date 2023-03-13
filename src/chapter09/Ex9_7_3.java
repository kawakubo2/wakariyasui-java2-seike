package chapter09;

import lib.Input;

public class Ex9_7_3 {
    public static void main(String[] args) {
        int year = Input.getInt();
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "うるう年": "平年");
    }
}

package chapter06;

import lib.Input;

public class Ex6_4_1 {
    public static void main(String[] args) {
        String address = Input.getString("住所");
        String name = Input.getString("名前");
        System.out.println("住所: " + address);
        System.out.println("名前: " + name);
    }
}

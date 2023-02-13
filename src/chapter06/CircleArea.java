package chapter06;

import lib.Input;

public class CircleArea {
    public static void main(String[] args) {
        double radius = Input.getDouble("半径");
        System.out.println("円の面積=" + (Math.pow(radius, 2) * Math.PI));

    }
}

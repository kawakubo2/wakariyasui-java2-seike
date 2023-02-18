package chapter06;

import lib.Input;

public class Ex6_5_2 {
    public static void main(String[] args) {
        double height = Input.getDouble("身長(cm)");
        double weight = Input.getDouble("体重(kg)");

        double bmi = weight / Math.pow(height / 100, 2);
        System.out.println("BMI値: " + bmi);

    }
}

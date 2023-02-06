package chapter05;

import java.math.BigDecimal;

public class KetsugoSoku {
    public static void main(String[] args) {
        double x = 0.2;
        double y = 0.6;
        System.out.println(x * 3);
        System.out.println(x * 10 * 3 == y * 10);
        double EPSILON = 10E-15;
        System.out.println(Math.abs(x * 3 - y) < EPSILON);

        BigDecimal b1 = new BigDecimal("0.2");
        BigDecimal b2 = new BigDecimal("0.6");
        BigDecimal b3 = new BigDecimal("3");

        System.out.println(b1.multiply(b3).equals(b2));
    }
}

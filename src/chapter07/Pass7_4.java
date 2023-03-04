package chapter07;

import lib.Input;

public class Pass7_4 {
    public static void main(String[] args) {
        double[] x = {10.2, 4.5, 12.5, 8.0, 5.5};
        double a = Input.getDouble();
        for (int i = 0; i < x.length; i++) {
            double ans = Math.abs(x[i] * a);
            System.out.printf("x[%d]=%6.2f ans=%8.2f%n", i, x[i], ans);
        }
    }
}

package chapter06;

import javax.swing.SortingFocusTraversalPolicy;

import lib.Input;

public class Pass6_1 {
    public static void main(String[] args) {
        double a, b, c;
        a = Input.getDouble("a:");
        b = Input.getDouble("b:");
        c = Input.getDouble("c:");
        double d = Math.pow(b, 2) - 4  * a * c;
    }
}

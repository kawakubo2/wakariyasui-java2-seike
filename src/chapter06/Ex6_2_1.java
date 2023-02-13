package chapter06;

public class Ex6_2_1 {
    public static void main(String[] args) {
        double a = 30.51, b = 2.68;
        System.out.println("--- (1) ---");
        System.out.println(Math.round(a / b));
        System.out.println("--- (2) ---");
        System.out.println(Math.pow(a, b));
        System.out.println("--- (3) ---");
        System.out.println(Math.min(a, b));
        System.out.println("--- (4) ---");
        System.out.println(Math.sqrt(a) + Math.sqrt(b));
        System.out.println("--- (5) ---");
        System.out.println(Math.random() + " " + Math.random());
    }
}

package chapter06;

public class Sample6_98 {
    public static void main(String[] args) {
        double[] d = {35.582, 123.8724, 78.13, 183.89183};
        for (double e: d) {
            System.out.printf("%7.2f%n", e);
        }
        String[] s = {"abc", "あいう", "xえy"};
        for (String e: s) {
            System.out.printf("%-10s%n", e);
        }
    }
}

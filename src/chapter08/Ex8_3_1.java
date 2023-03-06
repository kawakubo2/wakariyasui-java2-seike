package chapter08;

public class Ex8_3_1 {
    public static void main(String[] args) {
        int n[] = {31, 24, 12, 44, 61, 72, 18};
        double x[] = {20.1, 18.5, 22.8, 62.5};
        int intTotal = 0;
        for (int i = 0; i < n.length; i++) {
            intTotal += n[i];
        }
        System.out.println("合計=" + intTotal);
        double doubleTotal = 0;
        for (int i = 0; i < x.length; i++) {
            doubleTotal += x[i];
        }
        System.out.println("合計=" + doubleTotal);
    }
}

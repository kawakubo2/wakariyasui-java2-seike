package chapter08;

public class Pass8_1 {
    public static void main(String[] args) {
        double[] data = {12.3, 13.5, 11.5, 13.0, 12.8, 12.5};
        double total = 0;
        for (double d: data) {
            total += d;
        }
        System.out.println("合計=" + total);
        System.out.println("平均=" + (total / data.length));
        for (double d: data) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}

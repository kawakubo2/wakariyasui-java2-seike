package chapter08;

public class Sample8_8 {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        // Syntax Sugar(糖衣構文)
        for (int n: number) {
            System.out.print(n + "\t");
        }
        System.out.println();
    }
}

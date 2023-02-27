package chapter07;

public class Ex7_5_3 {
    public static void main(String[] args) {
        int[] n = {10, 15, 68, 2, 47};
        for (int i = 0; i < 5; i++) {
            System.out.println("n[" + i + "]=" + n[i]);
            System.out.printf("n[%d]=%d%n", i, n[i]);
        }
    }
}

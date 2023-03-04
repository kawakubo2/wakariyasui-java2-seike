package chapter08;

public class Ex8_1_1 {
    public static void main(String[] args) {
        String[] parts = {"CPU", "メモリー", "SSD", "ハードディスク"};
        printArray(parts);
    }
    public static void printArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}

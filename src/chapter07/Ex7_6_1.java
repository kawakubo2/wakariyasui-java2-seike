package chapter07;

public class Ex7_6_1 {
    public static void main(String[] args) {
        int[] n = {125, 78, 119, 4, 28, 25, 102};
        printIntArray(n);
    }
    public static void printIntArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
    }
}
